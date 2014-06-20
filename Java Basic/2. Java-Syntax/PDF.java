import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.FileOutputStream;

public class PDF {

	public static void main(String[] args) {
		
		Document document = new Document();
		
		try {
			
			PdfWriter.getInstance(document, new FileOutputStream("dec52.pdf"));
			PdfPTable table = new PdfPTable(13);
			table.setWidthPercentage(100);
            table.getDefaultCell().setFixedHeight(80);
            table.getDefaultCell().setColspan(0); 
            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
            table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
            
            BaseFont baseFont = BaseFont.createFont("./times.ttf", BaseFont.IDENTITY_H, true);

        	Font black = new Font(baseFont,20,Font.BOLD,new BaseColor(0,0,0)); 
			Font red = new Font(baseFont,20,Font.BOLD,new BaseColor(255,0,0));
			
			document.open();
			document.setPageSize(PageSize.A4);
						
			char[] suits = new char[] {'\u2663','\u2666','\u2665','\u2660'};
	
			for (int col = 0; col < suits.length ; col++) {
				
				for (int dec = 2; dec < 14; dec++) {
					
					if (dec ==2) {
						System.out.print("|A" + suits[col] + "|" );
						if (col == 0 || col == 3) {
							table.addCell(new Paragraph("A " + suits[col],black));	
						}else {
							table.addCell(new Paragraph("A " + suits[col],red));
						}		
						
					}
					if (dec == 11) {
						System.out.print("J" + suits[col] +  "|");
						if (col == 0 || col == 3) {
							table.addCell(new Paragraph("J " + suits[col],black));	
						}else {
							table.addCell(new Paragraph("J " + suits[col],red));
						}	
					} else if (dec == 12) {
						System.out.print("Q" + suits[col] + "|");
						if (col == 0 || col == 3) {
							table.addCell(new Paragraph("Q " + suits[col],black));	
						}else {
							table.addCell(new Paragraph("Q " + suits[col],red));
						}
					} else if (dec == 13) {
						System.out.print("K" + suits[col] + "|");	
						if (col == 0 || col == 3) {
							table.addCell(new Paragraph("K " + suits[col],black));
						}else {
							table.addCell(new Paragraph("K " + suits[col],red));
						}
					} else {
						System.out.print(String.valueOf(dec) + " "+ suits[col] + "|");
						if (col == 0 || col == 3) {
							table.addCell(new Paragraph(String.valueOf(dec)+ suits[col],black));
						}else {
							table.addCell(new Paragraph(String.valueOf(dec)+ suits[col],red));
						}
					}
				}
				System.out.println();	 
			}
			document.add(table);
			document.close();
		} catch (Exception e ) {
			e.printStackTrace();
		}	
	}
}
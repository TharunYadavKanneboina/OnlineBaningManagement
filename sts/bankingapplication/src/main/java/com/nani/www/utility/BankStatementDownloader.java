package com.nani.www.utility;

 import java.awt.Color;
import java.io.IOException;
import java.util.List;

import org.hibernate.type.descriptor.DateTimeUtils;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.nani.www.entity.BankAccountTransaction;

import jakarta.servlet.http.HttpServletResponse;
public class BankStatementDownloader {
   private List <BankAccountTransaction> transactions;
   private String startDate; 
   private String endDate;
   private Document document;
   
   public BankStatementDownloader(List <BankAccountTransaction> transactions, String startDate,String endDate) {
      this.transactions = transactions;
      this.startDate = startDate;
      this.endDate = endDate;
      
	   
   }
   private void writeTableHeader(PdfPTable table) {
	   PdfPCell cell = new  PdfPCell();
	   cell.setBackgroundColor(new Color(253,100,120));
	   cell.setPadding(5);
	   Font font = FontFactory.getFont(FontFactory.HELVETICA);
	   font.setColor(new Color(27,39,40));
	   cell.setPhrase(new Phrase("TrasactionId",font));
	   table.addCell(cell);
	   cell.setPhrase(new Phrase("TransactionType",font));
	   table.addCell(cell);
	   cell.setPhrase(new Phrase("Amount",font));
	   table.addCell(cell);
	   cell.setPhrase(new Phrase("Narration",font));
	   table.addCell(cell);
	   cell.setPhrase(new Phrase("DestinationBankAccount",font));
	   table.addCell(cell);
	   cell.setPhrase(new Phrase("TrasactionType",font));
	   table.addCell(cell);
	   
   }
   private void writeTableData(PdfPTable table)
   {
	   for(BankAccountTransaction transaction:transactions) {
		   table.addCell(transaction.getTransactionId());
		   table.addCell(transaction.getTransactionType());
		   table.addCell(String.valueOf(transaction.getAmount()));
		   table.addCell(transaction.getNarration());
		   table.addCell(transaction.getDestinationBankAccount()!=null?transaction.getDestinationBankAccount().getNumber():"--");
		   table.addCell(DateTimeUtility.getLocalDateTimeFromEpochTime(transaction.getTransactionTime()));
		   
		   
		   
	   }
   }
   public void export(HttpServletResponse response)throws DocumentException,IOException {
	   
       Document d = new Document(PageSize.A4);

       PdfWriter.getInstance(d, response.getOutputStream());
      
       document.open();
       Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
       headerFont.setSize(25);
       headerFont.setColor(120,55,135);
       Paragraph ph = new Paragraph("CustomerBankStatement\n",headerFont);
       ph.setAlignment(Paragraph.ALIGN_CENTER);
       d.add(ph);
       Font header = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
       header.setSize(20);
       header.setColor(255,0,255);
       Paragraph p = new Paragraph("BankDetails\n",header);
       p.setAlignment(Paragraph.ALIGN_CENTER);
       d.add(p);
       
       Font headerF = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
       headerF.setSize(25);
       headerF.setColor(153,204,255);
       Paragraph k = new Paragraph("BankTransactions\n",headerF);
       k.setAlignment(Paragraph.ALIGN_CENTER);
       d.add(k);
       
       
       Font headerP = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
       headerP.setSize(20);
       headerP.setColor(51,255,51);
       Paragraph a = new Paragraph("BankStatementFrom"+startDate+"To"+endDate+"+\n",headerP);
       a.setAlignment(Paragraph.ALIGN_CENTER);
       d.add(a);
       
       Font HeaderN = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		HeaderN.setSize(25);
		HeaderN.setColor(new Color(51,255,51));
		Paragraph prgrf=new Paragraph("BankName:"+transactions.get(0).getBank().getName(),HeaderN);
		prgrf.setAlignment(Paragraph.ALIGN_CENTER);
		d.add(prgrf);
		
		Font HeaderP = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		HeaderP.setSize(25);
		HeaderP.setColor(new Color(51,255,51));
		Paragraph l=new Paragraph("BankCode:"+transactions.get(0).getBank().getCode(),HeaderP);
		prgrf.setAlignment(Paragraph.ALIGN_CENTER);
		d.add(l);
		
		Font HeaderM = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		HeaderM.setSize(25);
		HeaderM.setColor(new Color(51,255,51));
		Paragraph M=new Paragraph("ifscCode:"+transactions.get(0).getBankAccount().getIfsccode(),HeaderM);
		prgrf.setAlignment(Paragraph.ALIGN_CENTER);
		d.add(M);
		
		Font HeaderL = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		HeaderL.setSize(25);
		HeaderL.setColor(new Color(51,255,51));
		Paragraph L=new Paragraph("email:"+transactions.get(0).getBank().getEmail(),HeaderL);
		prgrf.setAlignment(Paragraph.ALIGN_CENTER);
		d.add(L);
		
		Font HeaderR = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		HeaderR.setSize(25);
		HeaderR.setColor(new Color(51,255,51));
		Paragraph R=new Paragraph("contact:"+transactions.get(0).getUser().getContact());
		prgrf.setAlignment(Paragraph.ALIGN_CENTER);
		d.add(R);
		 PdfPTable pdfp = new PdfPTable(6);
		   pdfp.setWidthPercentage(100f);
		   pdfp.setSpacingBefore(10);
		   writeTableHeader(pdfp);
		   writeTableData(pdfp);
		   document.add(pdfp);
		   document.close();
		   
		
	}
  
}
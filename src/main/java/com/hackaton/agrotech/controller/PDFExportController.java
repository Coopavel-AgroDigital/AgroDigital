package com.hackaton.agrotech.controller;

import com.hackaton.agrotech.model.PDF;
import com.hackaton.agrotech.repository.PdfRepository;
import com.hackaton.agrotech.service.PDFGeneratorService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pdf")
public class PDFExportController {

    @Autowired
    private PDFGeneratorService pdfGeneratorService;

    private PdfRepository pdfRepository;

    public PDFExportController(PDFGeneratorService pdfGeneratorService, PdfRepository pdfRepository) {
        this.pdfGeneratorService = pdfGeneratorService;
        this.pdfRepository = pdfRepository;
    }

    @GetMapping("/generate")
    public void generatePDF(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.pdfGeneratorService.export(response);
    }

    @GetMapping("/listaPdf")
    public List<PDF> findAll() {
        return pdfRepository.findAll();
    }

    @PostMapping("/register")
    public PDF register(@RequestBody PDF pdf) {
        PDF newPDF = new PDF();
        newPDF.setId(pdf.getId());
        newPDF.setConteudo(pdf.getConteudo());
        pdfRepository.save(pdf);
        return newPDF;
    }

}

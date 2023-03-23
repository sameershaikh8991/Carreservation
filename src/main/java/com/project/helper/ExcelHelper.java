package com.project.helper;

import com.project.models.Car;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;


public class ExcelHelper {
    public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    static String[] HEADERs = { "Id", "carName", "carNumber", "totalSeats" ,"availableForBooking","fuleType" };
    static String SHEET = "Tutorials";

    public static ByteArrayInputStream tutorialsToExcel(List<Car> carList) {

        try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
            Sheet sheet = workbook.createSheet(SHEET);

            // Header
            Row headerRow = sheet.createRow(0);

            for (int col = 0; col < HEADERs.length; col++) {
                Cell cell = headerRow.createCell(col);
                cell.setCellValue(HEADERs[col]);
            }

            int rowIdx = 1;
            for (Car cars : carList) {
                Row row = sheet.createRow(rowIdx++);

                row.createCell(0).setCellValue(cars.getId());
                row.createCell(1).setCellValue(cars.getCarName());
                row.createCell(2).setCellValue(cars.getCarNumber());
                row.createCell(3).setCellValue(cars.getTotalSeats());
                row.createCell(4).setCellValue(cars.getAvailableForBooking());
                row.createCell(5).setCellValue(cars.getFuleType());
            }

            workbook.write(out);
            return new ByteArrayInputStream(out.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("fail to import data to Excel file: " + e.getMessage());
        }
    }

}
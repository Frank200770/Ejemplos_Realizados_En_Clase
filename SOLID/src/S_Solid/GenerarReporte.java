/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S_Solid;
            
import java.io.File;
import java.util.ArrayList;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
/**
 *
 * @author frank
 */
public class GenerarReporte {
    public void mostrarEmpleado(Empleado empleado)
    {
        CalcularSalario salario = new CalcularSalario();
        System.out.println("---- DATOS ----");
        System.out.println("Nombres:  " + empleado.getNombres());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Salario: " + salario.calcular(empleado));
    }
    
    public void generarPDF(ArrayList<Empleado> empleados)
    {
        try {
            
            
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage();
        CalcularSalario salario = new CalcularSalario();
        
        File archivo = new File("Empleados.pdf");

        if(archivo.exists()){
            archivo.delete();
        }

       

        documento.addPage(pagina);

        PDPageContentStream contenido =
                new PDPageContentStream(documento, pagina);

        contenido.beginText();

        contenido.setFont(
            new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD),
            16);

        contenido.newLineAtOffset(100, 700);

        contenido.showText("REPORTE DE EMPLEADOS");

        int y = 40;

        contenido.setFont(
            new PDType1Font(Standard14Fonts.FontName.HELVETICA),
            12);

        for (Empleado empleado : empleados) {

            contenido.newLineAtOffset(0, -y);
            contenido.showText("Nombre: "
                    + empleado.getNombres());

            contenido.newLineAtOffset(0, -20);
            contenido.showText("Departamento: "
                    + empleado.getDepartamento());

            contenido.newLineAtOffset(0, -20);
            contenido.showText("Horas Trabajadas: "
                    + empleado.getHorasTrabajadas());

            contenido.newLineAtOffset(0, -20);
            contenido.showText("Pago por Hora: $"
                    + empleado.getPagoHoras());
            
            contenido.newLineAtOffset(0, -20);
            contenido.showText("Sueldo: $"
                    + salario.calcular(empleado));
            
            contenido.newLineAtOffset(0, -30);
            contenido.showText("-----------------------------------------");

            y = 30;
        }

        contenido.endText();
        contenido.close();

        documento.save("Empleados.pdf");
        documento.close();

        System.out.println("PDF generado correctamente.");
        } catch (Exception ex) {

            System.out.println("Error al generar PDF: "
                    + ex.getMessage());
        }
    }
}

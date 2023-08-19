
package com.login;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Controlador_ventana {
    
    private JPanel Content;

    public Controlador_ventana() {
    }
    
    
    public void hora(JLabel dateTxt) {
            
    LocalDate now = LocalDate.now();        //este codigo sirve para mostrar la fecha//
   Locale SpanishLocale = new Locale("es", "Es");
    dateTxt.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'del' YYYY", SpanishLocale)));
    }
    public void cambiarPanel(JPanel jp) {
    jp.setVisible(true); // hace visible al panel
    jp.setSize(684, 300); // da el tamaño del panel
    jp.setLocation(0, 0); // centra el panel

    Content.removeAll(); // esto elimina lo que se encontraba en content
    Content.setLayout(new BorderLayout()); // Establecer el LayoutManager del contenedor Content en BorderLayout
    Content.add(jp, BorderLayout.CENTER); // Agregar el panel principal al centro del contenedor Content
    jp.setPreferredSize(Content.getSize()); // Asegurarse de que el panel principal ocupe todo el espacio disponible

    Content.revalidate(); // notifica al contenedor Content que su diseño ha cambiado y necesita ser validado.
    Content.repaint(); // repinta el contenedor Content para que se muestren los cambios realizados.
     }
    public void cambiarventana (JFrame Ventana ){
        Ventana.setVisible(true);
    }
}


import boofcv.alg.filter.binary.GThresholdImageOps;
import boofcv.core.image.ConvertImage;
import boofcv.gui.binary.VisualizeBinaryData;
import boofcv.io.image.ConvertBufferedImage;
import boofcv.struct.image.GrayU8;
import boofcv.struct.image.Planar;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
    private  BufferedImage imagen = null;
 
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(getImagen(),0,0, null);
    }
    
    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }
    //Método para el umbralizado de imágenes 
    BufferedImage umbralizar(BufferedImage imagen, int umbral) {
        // convierte la imagen en color BufferedImage en formato de la librería BoofCV
        Planar<GrayU8> imagenColor = ConvertBufferedImage.convertFromPlanar(imagen,
        null, true, GrayU8.class);
        // crea dos imágenes en niveles de grises
        GrayU8 imagenGris = new GrayU8(imagen.getWidth(), imagen.getHeight());
        GrayU8 imagenUmbralizada = new GrayU8(imagen.getWidth(), imagen.getHeight());
        // Convierte a niveles de gris la imagen de entrada
        ConvertImage.average(imagenColor,imagenGris);
        // umbraliza la imagen:
        // ‐ píxeles con nivel de gris > umbral se ponen a 1
        // ‐ píxeles con nivel de gris <= umbra se ponen a 0
        GThresholdImageOps.threshold(imagenGris, imagenUmbralizada, umbral, false);
        // se devuelve la imagen umbralizada en formato BufferedImage
        return VisualizeBinaryData.renderBinary(imagenUmbralizada, false, null);
    }
    
}

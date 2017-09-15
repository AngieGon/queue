package queuex;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author PRACTICAS
 */
public class QueueGrafica extends javax.swing.JFrame {
Queue cola=new LinkedList();
    /**
     * Creates new form QueueGrafica
     */
    public QueueGrafica() {
        initComponents();
    }
    private void BTNinsertarActionPerformed(java.awt.event.ActionEvent evt) {                                            
cola.add(TXTinsertar.getText());   
JOptionPane.showMessageDialog(null,"Se inserto elemento");
        
        TXTinsertar.setText("");// TODO add your handling code here:
    }                                           

    private void BTNimprimirActionPerformed(java.awt.event.ActionEvent evt) {                                            
if(cola.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
        else
        {
            TXTimprimir.setText(TXTimprimir.getText()+cola.toString());
        }        // TODO add your handling code here:
    }                                           

    private void BTNeliminarTodoActionPerformed(java.awt.event.ActionEvent evt) {                                                
cola.clear(); 
 JOptionPane.showMessageDialog(null,"Se ha eliminado toda la cola QUEUE");
 TXTimprimir.setText("");
// TODO add your handling code here:
    }                                               

    private void BTNbuscarActionPerformed(java.awt.event.ActionEvent evt) {                                          

        String valorBuscado= TXTbuscar.getText();

        if (cola.contains(valorBuscado)){
            JOptionPane.showMessageDialog(null,"El elemento si se encuentra en la cola");
        }
        else{
            JOptionPane.showMessageDialog(null,"El elemento no se encuentra en la cola");

        }
    }                                         

    private void BTNimprimirprimerelementoActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
        if(cola.isEmpty()==true){
            JOptionPane.showMessageDialog(null, "La cola esta vacia");
        }
        else
        TXTimprimirprimerelemento.setText(TXTimprimirprimerelemento.getText()+cola.peek().toString()+" ");
        
        TXTimprimirprimerelemento.getText();
        
        
    }                                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }
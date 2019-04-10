/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author gcs
 */
public class Bus {

    
       
    public static void main(String[] args) throws Exception{
        File xmlfile=new File("C:\\Users\\gcs\\Documents\\NetBeansProjects\\Bus\\trips\\trip information.xml" );
           DocumentBuilderFactory   documentBuilderFactory=  DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder=documentBuilderFactory.newDocumentBuilder();
        Document   document=documentBuilder.parse(xmlfile);
        NodeList list=document.getElementsByTagName("Developer") ;
        for(int i=0;i<list.getLength();i++){
            Node node=list.item(i);
            if(node.getNodeType()==Node.ELEMENT_NODE){
                Element element=(Element)node;
                System.out.println("password:"+ element.getElementsByTagName("password").item(i).getTextContent());
                 System.out.println("username:"+element.getElementsByTagName("username").item(i).getTextContent() );
           
            }
                
        }
    }
}
        
    


 


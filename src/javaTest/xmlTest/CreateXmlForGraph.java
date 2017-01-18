package javaTest.xmlTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class CreateXmlForGraph {
	public static Map<Integer,String> entities;
	public static List<MyEdge> edges;

	public static void main(String[] args) {

		setData();
	      try{
	         //root element
	         Element graph = new Element("graph");
	         Document doc = new Document(graph);	
	         
	         
	         doc.getRootElement().addContent(getNode(entities));
	         doc.getRootElement().addContent(getEdges(edges));

	         XMLOutputter xmlOutput = new XMLOutputter();

	         // display ml
	         xmlOutput.setFormat(Format.getPrettyFormat());
	         xmlOutput.output(doc, System.out); 
	      }catch(IOException e){
	         e.printStackTrace();
	      }		
	   }
	
	public static void setData(){
		entities = new HashMap<>();
		entities.put(1, "father");
		entities.put(2, "son1");
		entities.put(3, "son2");
		edges = new ArrayList<>();
		edges.add(new MyEdge(1, 2));
		edges.add(new MyEdge(1, 3));
		edges.add(new MyEdge(2, 3));

		
	}
	
	public static Element getNode(Map<Integer,String> entities){
		Element nodes = new Element("nodes");
		Set<Integer> keys = entities.keySet();
		for(Integer key :keys){
			Element node = new Element("node");
			node.setAttribute(new Attribute("id", String.valueOf(key)));
			node.setAttribute(new Attribute("name", entities.get(key)));
			nodes.addContent(node);
		}
		return nodes;
	}
	
	public static Element getEdges(List<MyEdge> edges){
		//TODO
		Element edgeNodes = new Element("edges");
		for(MyEdge myEdge :edges){
			Element edge = new Element("edge");
			edge.setAttribute(new Attribute("src", myEdge.getSrc().toString()));
			edge.setAttribute(new Attribute("tgt", myEdge.getTgt().toString()));
			edgeNodes.addContent(edge);
		}
		return edgeNodes;
	}
	
	public static class MyEdge{
		Integer src;
		Integer tgt;
		public MyEdge(Integer src,Integer tgt){
			this.src = src;
			this.tgt = tgt;
		}
		public Integer getSrc() {
			return src;
		}
		
		public Integer getTgt() {
			return tgt;
		}
	}
}

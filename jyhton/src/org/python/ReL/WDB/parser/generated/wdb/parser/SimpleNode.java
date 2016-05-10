/* Generated By:JJTree: Do not edit this line. SimpleNode.java */


package org.python.ReL.WDB.parser.generated.wdb.parser;

import org.python.ReL.WDB.database.wdb.metadata.Adapter;
import org.python.ReL.WDB.database.wdb.metadata.IndexSelectResult;
import org.python.ReL.WDB.database.wdb.metadata.WDBObject;

import java.io.*;
import java.util.ArrayList;

public class SimpleNode implements Node, Serializable {
  protected Node parent;
  protected Node[] children;
  protected int id;
  protected QueryParser parser;

  public SimpleNode(int i) {
    id = i;
  }

  public SimpleNode(QueryParser p, int i) {
    this(i);
    parser = p;
  }

  public void jjtOpen() {
  }

  public void jjtClose() {
  }
  
  public void jjtSetParent(Node n) { parent = n; }
  public Node jjtGetParent() { return parent; }

  public void jjtAddChild(Node n, int i) {
    if (children == null) {
      children = new Node[i + 1];
    } else if (i >= children.length) {
      Node c[] = new Node[i + 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = n;
  }

  public Node jjtGetChild(int i) {
    return children[i];
  }

  public int jjtGetNumChildren() {
    return (children == null) ? 0 : children.length;
  }

  /* You can override these two methods in subclasses of SimpleNode to
     customize the way the node appears when the tree is dumped.  If
     your output uses more than one line you should override
     toString(String), otherwise overriding toString() is probably all
     you need to do. */

  public String toString() { return QueryParserTreeConstants.jjtNodeName[id]; }
  public String toString(String prefix) { return prefix + toString(); }

  /* Override this method if you want to customize how the node dumps
     out its children. */

  public void dump(String prefix) {
    System.out.println(toString(prefix));
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
	SimpleNode n = (SimpleNode)children[i];
	if (n != null) {
	  n.dump(prefix + " ");
	}
      }
    }
  }
  public IndexSelectResult filterObjectsWithIndexes(Adapter da, ArrayList indexes) throws Exception
  {
	  IndexSelectResult isr = new IndexSelectResult();
	  //These conditions are not supported so return a "scan" or "can't help" result
	  return isr;
  }
  public boolean eval(Adapter da, WDBObject wdbO) throws Exception
  {
  	return false;
  }
}

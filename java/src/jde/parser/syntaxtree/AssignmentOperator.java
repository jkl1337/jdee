//
// Generated by JTB 1.1.2
//

package jde.parser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * f0 -> "="
 *       | "*="
 *       | "/="
 *       | "%="
 *       | "+="
 *       | "-="
 *       | "&lt;&lt;="
 *       | "&gt;&gt;="
 *       | "&gt;&gt;&gt;="
 *       | "&="
 *       | "^="
 *       | "|="
 * </PRE>
 */
public class AssignmentOperator implements Node {
   public NodeChoice f0;

   public AssignmentOperator(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(jde.parser.visitor.Visitor v) {
      v.visit(this);
   }
}


package soot.jimple.spark.queue;

import soot.util.*;
import soot.jimple.spark.bdddomains.*;
import soot.jimple.spark.*;
import soot.jimple.toolkits.callgraph.*;
import soot.*;
import soot.util.queue.*;
import jedd.*;
import java.util.*;

public final class Qctxt_local_obj_srcm_stmt_kind_tgtmBDD extends Qctxt_local_obj_srcm_stmt_kind_tgtm {
    private LinkedList readers = new LinkedList();
    
    public void add(Context _ctxt,
                    Local _local,
                    AllocNode _obj,
                    SootMethod _srcm,
                    Unit _stmt,
                    Kind _kind,
                    SootMethod _tgtm) {
        this.add(new jedd.internal.RelationContainer(new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                                     new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() },
                                                     ("this.add(jedd.internal.Jedd.v().literal(new java.lang.Object" +
                                                      "[...], new jedd.Attribute[...], new jedd.PhysicalDomain[...]" +
                                                      ")) at /home/olhotak/soot-2-jedd/src/soot/jimple/spark/queue/" +
                                                      "Qctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:33,8-11"),
                                                     jedd.internal.Jedd.v().literal(new Object[] { _ctxt, _local, _obj, _srcm, _stmt, _kind, _tgtm },
                                                                                    new Attribute[] { ctxt.v(), local.v(), obj.v(), srcm.v(), stmt.v(), kind.v(), tgtm.v() },
                                                                                    new PhysicalDomain[] { V2.v(), V1.v(), H1.v(), T1.v(), ST.v(), FD.v(), T2.v() })));
    }
    
    public void add(final jedd.internal.RelationContainer in) {
        for (Iterator it = readers.iterator(); it.hasNext(); ) {
            Rctxt_local_obj_srcm_stmt_kind_tgtmBDD reader = (Rctxt_local_obj_srcm_stmt_kind_tgtmBDD) it.next();
            reader.add(new jedd.internal.RelationContainer(new Attribute[] { stmt.v(), local.v(), srcm.v(), obj.v(), tgtm.v(), ctxt.v(), kind.v() },
                                                           new PhysicalDomain[] { ST.v(), V1.v(), T1.v(), H1.v(), T2.v(), V2.v(), FD.v() },
                                                           ("reader.add(in) at /home/olhotak/soot-2-jedd/src/soot/jimple/" +
                                                            "spark/queue/Qctxt_local_obj_srcm_stmt_kind_tgtmBDD.jedd:38,1" +
                                                            "2-18"),
                                                           in));
        }
    }
    
    public Rctxt_local_obj_srcm_stmt_kind_tgtm reader() {
        Rctxt_local_obj_srcm_stmt_kind_tgtm ret = new Rctxt_local_obj_srcm_stmt_kind_tgtmBDD();
        readers.add(ret);
        return ret;
    }
    
    public Qctxt_local_obj_srcm_stmt_kind_tgtmBDD() { super(); }
}
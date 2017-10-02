package com.sample;
import org.drools.core.event.DebugAgendaEventListener;
import org.kie.api.KieServices;
import org.kie.api.event.rule.DebugRuleRuntimeEventListener;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class ExpertoInferirCategoria {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	/*DTOInferirCategoria dtoICE = new DTOInferirCategoria();
        	dtoICE.setPorcentajeNoRequerido(0.65);
        	dtoICE.setPorcentajeNivel5(0.6);
        	DTOResultado dtoRE = new DTOResultado();
        	DTOInferirCategoria dtoICD = new DTOInferirCategoria();
        	dtoICD.setPorcentajeNoRequerido(0.7);
        	dtoICD.setPorcentajeNivel5(0.65);
        	dtoICD.setPorcentajeNivel4(0.6);
        	DTOResultado dtoRD = new DTOResultado();
        	DTOInferirCategoria dtoICC = new DTOInferirCategoria();
        	dtoICC.setPorcentajeNoRequerido(0.75);
        	dtoICC.setPorcentajeNivel5(0.7);
        	dtoICC.setPorcentajeNivel4(0.65);
        	dtoICC.setPorcentajeNivel3(0.6);
        	DTOResultado dtoRC = new DTOResultado();*/
        	DTOInferirCategoria dtoICB = new DTOInferirCategoria();
        	dtoICB.setPorcentajeNoRequerido(0.8);
        	dtoICB.setPorcentajeNivel5(0.75);
        	dtoICB.setPorcentajeNivel4(0.7);
        	dtoICB.setPorcentajeNivel3(0.65);
        	dtoICB.setPorcentajeNivel2(0.6);
        	DTOResultado dtoRB = new DTOResultado();
        	/*DTOInferirCategoria dtoICA = new DTOInferirCategoria();
        	dtoICA.setPorcentajeNoRequerido(0.85);
        	dtoICA.setPorcentajeNivel5(0.8);
        	dtoICA.setPorcentajeNivel4(0.75);
        	dtoICA.setPorcentajeNivel3(0.7);
        	dtoICA.setPorcentajeNivel2(0.65);
        	dtoICA.setPorcentajeNivel1(0.6);
        	DTOResultado dtoRA = new DTOResultado();*/
        	//kSession.insert(dtoICE);
        	//kSession.insert(dtoRE);
        	//kSession.insert(dtoICD);
        	//kSession.insert(dtoRD);
        	//kSession.insert(dtoICC);
        	//kSession.insert(dtoRC);
        	kSession.insert(dtoICB);
        	kSession.insert(dtoRB);
        	//kSession.insert(dtoICA);
        	//kSession.insert(dtoRA);
        	kSession.fireAllRules();
        	System.out.println(dtoICB.isCategorizado());
        	
        	
            

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
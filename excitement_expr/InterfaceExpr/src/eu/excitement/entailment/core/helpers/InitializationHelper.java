package eu.excitement.entailment.core.helpers;

import java.io.File;

import eu.excitement.entailment.core.*;
import eu.excitement.entailment.core.exceptions.ComponentException;
import eu.excitement.entailment.core.exceptions.ConfigurationException;
import eu.excitement.entailment.core.exceptions.EDAException;

public abstract class InitializationHelper<T extends TEDecision> {
	
	abstract public EDABasic<T> startEngineBasic(File f) throws ConfigurationException, EDAException, ComponentException;
	abstract public EDAMultiT<T> startEngineMultiT(File f) throws ConfigurationException, EDAException, ComponentException; 
	abstract public EDAMultiH<T> startEngineMultiH(File f) throws ConfigurationException, EDAException, ComponentException;
	abstract public EDAMultiTH<T> startEngineMultiTH(File f) throws ConfigurationException, EDAException, ComponentException;

}
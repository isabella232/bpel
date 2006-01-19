/**
 * <copyright>
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 * </copyright>
 *
 * $Id: OnMessage.java,v 1.3 2006/01/19 21:08:47 james Exp $
 */
package org.eclipse.bpel.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.wst.wsdl.Operation;
import org.eclipse.wst.wsdl.PortType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Receipt of the corresponding message, the activity is executed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getPortType <em>Port Type</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getPartnerLink <em>Partner Link</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getCorrelations <em>Correlations</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.bpel.model.OnMessage#getFromPart <em>From Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage()
 * @model
 * @generated
 */
public interface OnMessage extends ExtensibleElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Activity)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_Activity()
	 * @model containment="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * Returns the value of the '<em><b>Port Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Type</em>' reference.
	 * @see #setPortType(PortType)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_PortType()
	 * @model required="true"
	 * @generated
	 */
	PortType getPortType();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getPortType <em>Port Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Type</em>' reference.
	 * @see #getPortType()
	 * @generated
	 */
	void setPortType(PortType value);

	/**
	 * Returns the value of the '<em><b>Partner Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Link</em>' reference.
	 * @see #setPartnerLink(PartnerLink)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_PartnerLink()
	 * @model required="true"
	 * @generated
	 */
	PartnerLink getPartnerLink();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getPartnerLink <em>Partner Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Link</em>' reference.
	 * @see #getPartnerLink()
	 * @generated
	 */
	void setPartnerLink(PartnerLink value);

	/**
	 * Returns the value of the '<em><b>Correlations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlations</em>' containment reference.
	 * @see #setCorrelations(Correlations)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_Correlations()
	 * @model containment="true"
	 * @generated
	 */
	Correlations getCorrelations();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getCorrelations <em>Correlations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlations</em>' containment reference.
	 * @see #getCorrelations()
	 * @generated
	 */
	void setCorrelations(Correlations value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(Operation)
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_Operation()
	 * @model required="true"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link org.eclipse.bpel.model.OnMessage#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

	/**
	 * Returns the value of the '<em><b>From Part</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpel.model.FromPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Part</em>' reference list.
	 * @see org.eclipse.bpel.model.BPELPackage#getOnMessage_FromPart()
	 * @model type="org.eclipse.bpel.model.FromPart"
	 * @generated
	 */
	EList getFromPart();

} // OnMessage

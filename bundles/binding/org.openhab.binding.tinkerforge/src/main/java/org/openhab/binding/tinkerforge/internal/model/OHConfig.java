/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OH Config</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.3.0
 *        <!-- end-user-doc -->
 *
 *        <p>
 *        The following features are supported:
 *        </p>
 *        <ul>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.OHConfig#getOhTfDevices <em>Oh Tf Devices</em>}</li>
 *        </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getOHConfig()
 * @model
 * @generated
 */
public interface OHConfig extends EObject {
    /**
     * Returns the value of the '<em><b>Oh Tf Devices</b></em>' containment reference list.
     * The list contents are of type {@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice}&lt;?, ?>.
     * It is bidirectional and its opposite is
     * '{@link org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhConfig <em>Oh Config</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Oh Tf Devices</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Oh Tf Devices</em>' containment reference list.
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getOHConfig_OhTfDevices()
     * @see org.openhab.binding.tinkerforge.internal.model.OHTFDevice#getOhConfig
     * @model opposite="ohConfig" containment="true"
     * @generated
     */
    EList<OHTFDevice<?, ?>> getOhTfDevices();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model unique="false" uidUnique="false" subidUnique="false"
     * @generated
     */
    OHTFDevice<?, ?> getConfigByTFId(String uid, String subid);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model unique="false" ohidUnique="false"
     * @generated
     */
    OHTFDevice<?, ?> getConfigByOHId(String ohid);

} // OHConfig

/*
 * Copyright (c) 2019 the Eclipse Milo Authors
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.milo.opcua.sdk.server.model.types.variables;

import org.eclipse.milo.opcua.sdk.core.QualifiedProperty;
import org.eclipse.milo.opcua.sdk.core.ValueRanks;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.enumerated.AxisScaleEnumeration;
import org.eclipse.milo.opcua.stack.core.types.structured.EUInformation;
import org.eclipse.milo.opcua.stack.core.types.structured.Range;

public interface ArrayItemType extends DataItemType {
    QualifiedProperty<Range> INSTRUMENT_RANGE = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "InstrumentRange",
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=884"),
        ValueRanks.Scalar,
        Range.class
    );

    QualifiedProperty<Range> E_U_RANGE = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "EURange",
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=884"),
        ValueRanks.Scalar,
        Range.class
    );

    QualifiedProperty<EUInformation> ENGINEERING_UNITS = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "EngineeringUnits",
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=887"),
        ValueRanks.Scalar,
        EUInformation.class
    );

    QualifiedProperty<LocalizedText> TITLE = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "Title",
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=21"),
        ValueRanks.Scalar,
        LocalizedText.class
    );

    QualifiedProperty<AxisScaleEnumeration> AXIS_SCALE_TYPE = new QualifiedProperty<>(
        "http://opcfoundation.org/UA/",
        "AxisScaleType",
        ExpandedNodeId.parse("nsu=http://opcfoundation.org/UA/;i=12077"),
        ValueRanks.Scalar,
        AxisScaleEnumeration.class
    );

    PropertyType getInstrumentRangeNode();

    Range getInstrumentRange();

    void setInstrumentRange(Range value);

    PropertyType getEURangeNode();

    Range getEURange();

    void setEURange(Range value);

    PropertyType getEngineeringUnitsNode();

    EUInformation getEngineeringUnits();

    void setEngineeringUnits(EUInformation value);

    PropertyType getTitleNode();

    LocalizedText getTitle();

    void setTitle(LocalizedText value);

    PropertyType getAxisScaleTypeNode();

    AxisScaleEnumeration getAxisScaleType();

    void setAxisScaleType(AxisScaleEnumeration value);
}

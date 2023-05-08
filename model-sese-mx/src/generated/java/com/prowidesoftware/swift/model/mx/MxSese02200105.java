
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.022.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStsOrStmtQryStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.022.001.05")
public class MxSese02200105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
    protected SecuritiesStatusOrStatementQueryStatusAdviceV05 sctiesStsOrStmtQryStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason12 .class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, DocumentIdentification30 .class, DocumentNumber13 .class, DocumentNumber16 .class, DocumentNumber5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification14 .class, Identification26 .class, MxSese02200105 .class, NoReasonCode.class, PartyIdentification127Choice.class, PartyIdentification144 .class, ProcessingStatus55Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectionAndRepairReason26Choice.class, RejectionOrRepairReason26 .class, RejectionOrRepairStatus32Choice.class, RejectionReason24Code.class, SecuritiesAccount19 .class, SecuritiesStatusOrStatementQueryStatusAdviceV05 .class, StatusOrStatement9Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.022.001.05";

    public MxSese02200105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02200105(final String xml) {
        this();
        MxSese02200105 tmp = parse(xml);
        sctiesStsOrStmtQryStsAdvc = tmp.getSctiesStsOrStmtQryStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02200105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdviceV05 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV05 getSctiesStsOrStmtQryStsAdvc() {
        return sctiesStsOrStmtQryStsAdvc;
    }

    /**
     * Sets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdviceV05 }
     *     
     */
    public MxSese02200105 setSctiesStsOrStmtQryStsAdvc(SecuritiesStatusOrStatementQueryStatusAdviceV05 value) {
        this.sctiesStsOrStmtQryStsAdvc = value;
        return this;
    }

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese02200105 parse(String xml) {
        return ((MxSese02200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02200105 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02200105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02200105 parse(String xml, MxRead parserImpl) {
        return ((MxSese02200105) parserImpl.read(MxSese02200105 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxSese02200105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02200105 message
     * @return
     *     a new instance of MxSese02200105
     */
    public static final MxSese02200105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02200105 .class);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}

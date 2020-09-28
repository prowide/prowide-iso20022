
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.022.002.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStsOrStmtQryStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.022.002.01")
public class MxSese02200201
    extends AbstractMX
{

    @XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
    protected SecuritiesStatusOrStatementQueryStatusAdvice002V01 sctiesStsOrStmtQryStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 2;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus4Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason4 .class, AcknowledgementReason6Choice.class, CopyDuplicate1Code.class, DateAndDateTimeChoice.class, DocumentIdentification16 .class, DocumentNumber2Choice.class, DocumentNumber3 .class, DocumentNumber4 .class, Extension2 .class, ExtensionEnvelope1 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, Identification4 .class, Identification5 .class, MxSese02200201 .class, NameAndAddress12 .class, NoReasonCode.class, PartyIdentification16Choice.class, PartyIdentification18Choice.class, ProcessingStatus8Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason5Choice.class, RejectionOrRepairReason5 .class, RejectionOrRepairStatus7Choice.class, RejectionReason24Code.class, SecuritiesAccount17 .class, SecuritiesStatusOrStatementQueryStatusAdvice002V01 .class, StatusOrStatement2Choice.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:sese.022.002.01";

    public MxSese02200201() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02200201(final String xml) {
        this();
        MxSese02200201 tmp = parse(xml);
        sctiesStsOrStmtQryStsAdvc = tmp.getSctiesStsOrStmtQryStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02200201(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdvice002V01 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdvice002V01 getSctiesStsOrStmtQryStsAdvc() {
        return sctiesStsOrStmtQryStsAdvc;
    }

    /**
     * Sets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdvice002V01 }
     *     
     */
    public MxSese02200201 setSctiesStsOrStmtQryStsAdvc(SecuritiesStatusOrStatementQueryStatusAdvice002V01 value) {
        this.sctiesStsOrStmtQryStsAdvc = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSese02200201 parse(String xml) {
        return ((MxSese02200201) MxReadImpl.parse(MxSese02200201 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02200201 parse(String xml, MxRead parserImpl) {
        return ((MxSese02200201) parserImpl.read(MxSese02200201 .class, xml, _classes));
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
     * Creates an MxSese02200201 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02200201 message
     * @return
     *     a new instance of MxSese02200201
     */
    public final static MxSese02200201 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSese02200201 .class);
    }

}

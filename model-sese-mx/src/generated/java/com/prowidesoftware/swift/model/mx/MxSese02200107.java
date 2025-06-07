
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for sese.022.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStsOrStmtQryStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.022.001.07")
public class MxSese02200107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
    protected SecuritiesStatusOrStatementQueryStatusAdviceV07 sctiesStsOrStmtQryStsAdvc;
    public final static transient String BUSINESS_PROCESS = "sese";
    public final static transient int FUNCTIONALITY = 22;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus24Choice.class, AcknowledgementReason12 .class, AcknowledgementReason15Choice.class, AcknowledgementReason3Code.class, BlockChainAddressWallet3 .class, DocumentIdentification54 .class, DocumentNumber13 .class, DocumentNumber21 .class, DocumentNumber5Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, Identification31 .class, MxSese02200107 .class, NoReasonCode.class, PartyIdentification127Choice.class, PartyIdentification144 .class, ProcessingStatus89Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, RejectionAndRepairReason39Choice.class, RejectionOrRepairReason39 .class, RejectionOrRepairStatus44Choice.class, RejectionReason77Code.class, SecuritiesAccount19 .class, SecuritiesStatusOrStatementQueryStatusAdviceV07 .class, StatusOrStatement13Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:sese.022.001.07";

    public MxSese02200107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02200107(final String xml) {
        this();
        MxSese02200107 tmp = parse(xml);
        sctiesStsOrStmtQryStsAdvc = tmp.getSctiesStsOrStmtQryStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02200107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdviceV07 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdviceV07 getSctiesStsOrStmtQryStsAdvc() {
        return sctiesStsOrStmtQryStsAdvc;
    }

    /**
     * Sets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdviceV07 }
     *     
     */
    public MxSese02200107 setSctiesStsOrStmtQryStsAdvc(SecuritiesStatusOrStatementQueryStatusAdviceV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxSese02200107 parse(String xml) {
        return ((MxSese02200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02200107 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02200107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02200107 parse(String xml, MxRead parserImpl) {
        return ((MxSese02200107) parserImpl.read(MxSese02200107 .class, xml, _classes));
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
     * Creates an MxSese02200107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02200107 message
     * @return
     *     a new instance of MxSese02200107
     */
    public final static MxSese02200107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02200107 .class);
    }

}

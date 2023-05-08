
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
 * Class for sese.022.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesStsOrStmtQryStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:sese.022.002.03")
public class MxSese02200203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesStsOrStmtQryStsAdvc", required = true)
    protected SecuritiesStatusOrStatementQueryStatusAdvice002V03 sctiesStsOrStmtQryStsAdvc;
    public static final transient String BUSINESS_PROCESS = "sese";
    public static final transient int FUNCTIONALITY = 22;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AcknowledgedAcceptedStatus18Choice.class, AcknowledgementReason3Code.class, AcknowledgementReason4 .class, AcknowledgementReason6Choice.class, DocumentIdentification26 .class, DocumentNumber11 .class, DocumentNumber2Choice.class, DocumentNumber3 .class, GenericIdentification23 .class, GenericIdentification24 .class, GenericIdentification25 .class, Identification13 .class, Identification4 .class, MxSese02200203 .class, NoReasonCode.class, PartyIdentification51Choice.class, ProcessingStatus28Choice.class, ProprietaryReason2 .class, ProprietaryStatusAndReason2 .class, RejectionAndRepairReason5Choice.class, RejectionOrRepairReason5 .class, RejectionOrRepairStatus23Choice.class, RejectionReason24Code.class, SecuritiesAccount17 .class, SecuritiesStatusOrStatementQueryStatusAdvice002V03 .class, StatusOrStatement6Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:sese.022.002.03";

    public MxSese02200203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSese02200203(final String xml) {
        this();
        MxSese02200203 tmp = parse(xml);
        sctiesStsOrStmtQryStsAdvc = tmp.getSctiesStsOrStmtQryStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSese02200203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdvice002V03 }
     *     
     */
    public SecuritiesStatusOrStatementQueryStatusAdvice002V03 getSctiesStsOrStmtQryStsAdvc() {
        return sctiesStsOrStmtQryStsAdvc;
    }

    /**
     * Sets the value of the sctiesStsOrStmtQryStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesStatusOrStatementQueryStatusAdvice002V03 }
     *     
     */
    public MxSese02200203 setSctiesStsOrStmtQryStsAdvc(SecuritiesStatusOrStatementQueryStatusAdvice002V03 value) {
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
    public static MxSese02200203 parse(String xml) {
        return ((MxSese02200203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSese02200203 parse(String xml, MxReadConfiguration conf) {
        return ((MxSese02200203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSese02200203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSese02200203 parse(String xml, MxRead parserImpl) {
        return ((MxSese02200203) parserImpl.read(MxSese02200203 .class, xml, _classes));
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
     * Creates an MxSese02200203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSese02200203 message
     * @return
     *     a new instance of MxSese02200203
     */
    public static final MxSese02200203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSese02200203 .class);
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

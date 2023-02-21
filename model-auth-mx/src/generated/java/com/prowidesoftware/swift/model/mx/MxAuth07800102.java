
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.078.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sctiesFincgRptgPairgReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.078.001.02")
public class MxAuth07800102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SctiesFincgRptgPairgReq", required = true)
    protected SecuritiesFinancingReportingPairingRequestV02 sctiesFincgRptgPairgReq;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 78;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AgreementType2Choice.class, GenericIdentification175 .class, MasterAgreement7 .class, MxAuth07800102 .class, NaturalPersonIdentification2 .class, OrganisationIdentification15Choice.class, OrganisationIdentification38 .class, PartyIdentification236Choice.class, SecuritiesFinancingReportingPairingRequestV02 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TradeTransactionIdentification15 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.078.001.02";

    public MxAuth07800102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth07800102(final String xml) {
        this();
        MxAuth07800102 tmp = parse(xml);
        sctiesFincgRptgPairgReq = tmp.getSctiesFincgRptgPairgReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth07800102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sctiesFincgRptgPairgReq property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancingReportingPairingRequestV02 }
     *     
     */
    public SecuritiesFinancingReportingPairingRequestV02 getSctiesFincgRptgPairgReq() {
        return sctiesFincgRptgPairgReq;
    }

    /**
     * Sets the value of the sctiesFincgRptgPairgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancingReportingPairingRequestV02 }
     *     
     */
    public MxAuth07800102 setSctiesFincgRptgPairgReq(SecuritiesFinancingReportingPairingRequestV02 value) {
        this.sctiesFincgRptgPairgReq = value;
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
    public static MxAuth07800102 parse(String xml) {
        return ((MxAuth07800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth07800102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth07800102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth07800102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth07800102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth07800102) parserImpl.read(MxAuth07800102 .class, xml, _classes));
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
     * Creates an MxAuth07800102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth07800102 message
     * @return
     *     a new instance of MxAuth07800102
     */
    public final static MxAuth07800102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth07800102 .class);
    }

}

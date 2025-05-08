
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
 * Class for casr.001.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmRptgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casr.001.001.03")
public class MxCasr00100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmRptgInitn", required = true)
    protected SettlementReportingInitiationV03 sttlmRptgInitn;
    public static final transient String BUSINESS_PROCESS = "casr";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalData2 .class, AdditionalFee3 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount17 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType41 .class, ContentType2Code.class, ContentType3Code.class, CreditDebit3Code.class, EncryptedContent8 .class, EncryptedData2 .class, EncryptedData2Choice.class, EncryptedDataElement2 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData12 .class, FinancialInstitution9 .class, GenericIdentification183 .class, Header71 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalData14 .class, MACData1 .class, MxCasr00100103 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification285 .class, PartyIdentification286 .class, PartyType17Code.class, PartyType18Code.class, PartyType32Code.class, ProgrammeMode5 .class, ProtectedData2 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation4 .class, RelativeDistinguishedName1 .class, SettlementCategoryTotal2 .class, SettlementCategoryTotal3 .class, SettlementReportType1Code.class, SettlementReportingInitiationV03 .class, SettlementService6 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability10 .class, TypeOfAmount21Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casr.001.001.03";

    public MxCasr00100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasr00100103(final String xml) {
        this();
        MxCasr00100103 tmp = parse(xml);
        sttlmRptgInitn = tmp.getSttlmRptgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasr00100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmRptgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingInitiationV03 }
     *     
     */
    public SettlementReportingInitiationV03 getSttlmRptgInitn() {
        return sttlmRptgInitn;
    }

    /**
     * Sets the value of the sttlmRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingInitiationV03 }
     *     
     */
    public MxCasr00100103 setSttlmRptgInitn(SettlementReportingInitiationV03 value) {
        this.sttlmRptgInitn = value;
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
    public static MxCasr00100103 parse(String xml) {
        return ((MxCasr00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasr00100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasr00100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasr00100103 parse(String xml, MxRead parserImpl) {
        return ((MxCasr00100103) parserImpl.read(MxCasr00100103 .class, xml, _classes));
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
     * Creates an MxCasr00100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasr00100103 message
     * @return
     *     a new instance of MxCasr00100103
     */
    public static final MxCasr00100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasr00100103 .class);
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

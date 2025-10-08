
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
 * Class for casr.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sttlmRptgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:casr.001.001.02")
public class MxCasr00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "SttlmRptgInitn", required = true)
    protected SettlementReportingInitiationV02 sttlmRptgInitn;
    public final static transient String BUSINESS_PROCESS = "casr";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee2 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, Amount17 .class, AttributeType1Code.class, BatchManagementInformation1 .class, BytePadding1Code.class, CardProgrammeMode3 .class, CertificateIssuer1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context17 .class, CreditDebit3Code.class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment27 .class, FeeAmount3 .class, FinancialInstitution6 .class, GenericIdentification183 .class, Header66 .class, IssuerAndSerialNumber1 .class, Jurisdiction2 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, LocalData1 .class, MACData1 .class, MessageFunction29Code.class, MxCasr00100102 .class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification258 .class, PartyIdentification263 .class, PartyType17Code.class, PartyType18Code.class, Priority3Code.class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, Reconciliation3 .class, RelativeDistinguishedName1 .class, SettlementCategoryTotal2 .class, SettlementReportType1Code.class, SettlementReportingEntity1 .class, SettlementReportingInitiation2 .class, SettlementReportingInitiationV02 .class, SettlementService4 .class, SettlementServiceDate2 .class, SettlementServiceMode1 .class, SettlementTotals2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Traceability9 .class, Transaction138 .class, TransactionContext10 .class, TransactionIdentification12 .class, TransactionLifeCycleIdentification2 .class, TypeOfAmount21Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:casr.001.001.02";

    public MxCasr00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCasr00100102(final String xml) {
        this();
        MxCasr00100102 tmp = parse(xml);
        sttlmRptgInitn = tmp.getSttlmRptgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCasr00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sttlmRptgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingInitiationV02 }
     *     
     */
    public SettlementReportingInitiationV02 getSttlmRptgInitn() {
        return sttlmRptgInitn;
    }

    /**
     * Sets the value of the sttlmRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingInitiationV02 }
     *     
     */
    public MxCasr00100102 setSttlmRptgInitn(SettlementReportingInitiationV02 value) {
        this.sttlmRptgInitn = value;
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
    public static MxCasr00100102 parse(String xml) {
        return ((MxCasr00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCasr00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxCasr00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCasr00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCasr00100102 parse(String xml, MxRead parserImpl) {
        return ((MxCasr00100102) parserImpl.read(MxCasr00100102 .class, xml, _classes));
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
     * Creates an MxCasr00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCasr00100102 message
     * @return
     *     a new instance of MxCasr00100102
     */
    public final static MxCasr00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCasr00100102 .class);
    }

}

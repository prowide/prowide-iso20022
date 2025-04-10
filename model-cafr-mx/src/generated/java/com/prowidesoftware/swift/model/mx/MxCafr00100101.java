
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
 * Class for cafr.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "frdRptgInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:cafr.001.001.01")
public class MxCafr00100101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "FrdRptgInitn", required = true)
    protected FraudReportingInitiationV01 frdRptgInitn;
    public static final transient String BUSINESS_PROCESS = "cafr";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalData1 .class, AdditionalFee1 .class, AdditionalInformation22 .class, Address1 .class, Algorithm13Code.class, Algorithm20Code.class, Algorithm23Code.class, Algorithm5Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification25 .class, AlgorithmIdentification26 .class, AlgorithmIdentification27 .class, AlgorithmIdentification28 .class, AttributeType1Code.class, AuthenticationMethod11Code.class, AuthorisationStatus1 .class, BatchManagementInformation1 .class, BytePadding1Code.class, CardData3 .class, CardNotReceivedDetails1 .class, CardProgrammeMode1 .class, CardSecurityCapability1 .class, CardSecurityCapability1Code.class, Cardholder15 .class, CardholderName1 .class, CertificateIssuer1 .class, Contact1 .class, ContentInformationType20 .class, ContentType2Code.class, ContentType3Code.class, Context8 .class, Credentials1 .class, DisputeData2 .class, DisputeIdentification1 .class, DisputeReference1 .class, EncryptedContent5 .class, EncryptedData1 .class, EncryptedData1Choice.class, EncryptedDataElement1 .class, EncryptedDataFormat1Code.class, EncryptionFormat3Code.class, EnvelopedData6 .class, Environment10 .class, FeeAmount2 .class, FraudCaseDetails1 .class, FraudReportingAction1Code.class, FraudReportingInitiation1 .class, FraudReportingInitiationV01 .class, FraudType1Code.class, FraudulentTransactionData1 .class, GenericIdentification172 .class, Header48 .class, Identification2Code.class, IssuerAndSerialNumber1 .class, KEK6 .class, KEKIdentifier2 .class, KEKIdentifier6 .class, KeyTransport6 .class, MACData1 .class, MessageFunction29Code.class, MxCafr00100101 .class, OutputFormat4Code.class, Parameter13 .class, Parameter14 .class, Parameter7 .class, PartyIdentification197 .class, PartyType17Code.class, PartyType18Code.class, PartyType19Code.class, PartyType26Code.class, PartyType32Code.class, ProtectedData1 .class, Recipient5Choice.class, Recipient7Choice.class, RelativeDistinguishedName1 .class, ReportedFraud1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, Token1 .class, Traceability7 .class, Transaction79 .class, TransactionContext5 .class, TypeOfAmount10Code.class, UserInterface8Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:cafr.001.001.01";

    public MxCafr00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCafr00100101(final String xml) {
        this();
        MxCafr00100101 tmp = parse(xml);
        frdRptgInitn = tmp.getFrdRptgInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCafr00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the frdRptgInitn property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportingInitiationV01 }
     *     
     */
    public FraudReportingInitiationV01 getFrdRptgInitn() {
        return frdRptgInitn;
    }

    /**
     * Sets the value of the frdRptgInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportingInitiationV01 }
     *     
     */
    public MxCafr00100101 setFrdRptgInitn(FraudReportingInitiationV01 value) {
        this.frdRptgInitn = value;
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
    public static MxCafr00100101 parse(String xml) {
        return ((MxCafr00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCafr00100101 parse(String xml, MxReadConfiguration conf) {
        return ((MxCafr00100101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCafr00100101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCafr00100101 parse(String xml, MxRead parserImpl) {
        return ((MxCafr00100101) parserImpl.read(MxCafr00100101 .class, xml, _classes));
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
     * Creates an MxCafr00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCafr00100101 message
     * @return
     *     a new instance of MxCafr00100101
     */
    public static final MxCafr00100101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCafr00100101 .class);
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

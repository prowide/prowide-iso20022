
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for caaa.011.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.02")
public class MxCaaa01100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV02 accptrBtchTrf;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferV02 .class, Acquirer2 .class, Acquirer3 .class, Action2 .class, ActionMessage1 .class, ActionType2Code.class, AddressVerification1 .class, Algorithm2Code.class, Algorithm3Code.class, Algorithm4Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification2 .class, AlgorithmIdentification3 .class, AlgorithmIdentification4 .class, AlgorithmIdentification5 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData2 .class, AuthenticationEntity1Code.class, AuthenticationMethod2Code.class, AuthorisationResult1 .class, AuthorisationResult3 .class, CSCResult1Code.class, CardAccountType1Code.class, CardDataReading1Code.class, CardPaymentBatchTransfer1 .class, CardPaymentContext4 .class, CardPaymentDataSet4 .class, CardPaymentDataSetTransaction1Choice.class, CardPaymentDataSetTransaction2 .class, CardPaymentDataSetTransaction3 .class, CardPaymentDataSetTransaction4 .class, CardPaymentDataSetTransaction5 .class, CardPaymentEnvironment13 .class, CardPaymentEnvironment14 .class, CardPaymentEnvironment16 .class, CardPaymentServiceType2Code.class, CardPaymentServiceType3Code.class, CardPaymentServiceType4Code.class, CardPaymentTransaction12 .class, CardPaymentTransaction14 .class, CardPaymentTransaction17 .class, CardPaymentTransaction18 .class, CardPaymentTransaction19 .class, CardPaymentTransaction20 .class, CardPaymentTransactionDetails10 .class, CardPaymentTransactionDetails11 .class, CardPaymentTransactionDetails4 .class, CardPaymentTransactionDetails9 .class, CardPaymentTransactionResult1 .class, Cardholder4 .class, CardholderAddressVerificationResult1Code.class, CardholderAuthentication4 .class, CardholderIdentification1 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, CommonData2 .class, CommunicationCharacteristics1 .class, ContentInformationType4 .class, ContentInformationType5 .class, ContentType1Code.class, DataSetCategory1Code.class, DataSetIdentification1 .class, DetailedAmount1 .class, DetailedAmount2 .class, DigestedData2 .class, DisplayCapabilities1 .class, EncapsulatedContent1 .class, EncryptedContent2 .class, EnvelopedData2 .class, FailureReason2Code.class, Frequency4Code.class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, GenericIdentification48 .class, Header3 .class, IssuerAndSerialNumber1 .class, KEK2 .class, KEKIdentifier1 .class, KeyTransport2 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCaaa01100102 .class, NamedKeyEncryptedData2 .class, OnLineCapability1Code.class, OnLineReason1Code.class, Organisation8 .class, Organisation9 .class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Parameter1 .class, Parameter2 .class, Parameter3 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard6 .class, PaymentContext4 .class, PersonIdentificationType4Code.class, PlainCardData2 .class, PlainCardData3 .class, PointOfInteraction2 .class, PointOfInteractionCapabilities1 .class, PointOfInteractionComponent3 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics1 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, Product1 .class, Recipient2Choice.class, RecurringTransaction1 .class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, SignedData2 .class, Signer2 .class, TMSContactLevel1Code.class, TMSTrigger1 .class, Traceability1 .class, TrackData1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals2 .class, TransactionVerificationResult2 .class, TypeOfAmount1Code.class, TypeOfAmount2Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure1Code.class, UserInterface1Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.02";

    public MxCaaa01100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100102(final String xml) {
        this();
        MxCaaa01100102 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV02 }
     *     
     */
    public AcceptorBatchTransferV02 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV02 }
     *     
     */
    public MxCaaa01100102 setAccptrBtchTrf(AcceptorBatchTransferV02 value) {
        this.accptrBtchTrf = value;
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
    public static MxCaaa01100102 parse(String xml) {
        return ((MxCaaa01100102) MxReadImpl.parse(MxCaaa01100102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100102 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100102) parserImpl.read(MxCaaa01100102 .class, xml, _classes));
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
     * Creates an MxCaaa01100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100102 message
     * @return
     *     a new instance of MxCaaa01100102
     */
    public final static MxCaaa01100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01100102 .class);
    }

}

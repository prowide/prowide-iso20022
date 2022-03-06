
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
 * Class for caaa.011.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.04")
public class MxCaaa01100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV04 accptrBtchTrf;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferV04 .class, AccountingAccount1 .class, Acquirer4 .class, Acquirer5 .class, Action3 .class, ActionMessage1 .class, ActionType3Code.class, AdditionalInformation1 .class, AdditionalInformation6 .class, AddressType2Code.class, AddressVerification1 .class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, AggregationTransaction1 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AmountAndDirection41 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod3Code.class, AuthenticationMethod4Code.class, AuthorisationResult4 .class, AuthorisationResult6 .class, BinaryFile1 .class, BytePadding1Code.class, CardAccountType2Code.class, CardDataReading1Code.class, CardFallback1Code.class, CardPaymentBatchTransfer3 .class, CardPaymentContext12 .class, CardPaymentContext13 .class, CardPaymentDataSet10 .class, CardPaymentDataSetTransaction10 .class, CardPaymentDataSetTransaction11 .class, CardPaymentDataSetTransaction12 .class, CardPaymentDataSetTransaction13 .class, CardPaymentDataSetTransaction3Choice.class, CardPaymentEnvironment32 .class, CardPaymentEnvironment39 .class, CardPaymentEnvironment40 .class, CardPaymentEnvironment41 .class, CardPaymentInvoice1 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentToken1 .class, CardPaymentToken2 .class, CardPaymentToken3 .class, CardPaymentTransaction37 .class, CardPaymentTransaction39 .class, CardPaymentTransaction45 .class, CardPaymentTransaction46 .class, CardPaymentTransaction47 .class, CardPaymentTransaction48 .class, CardPaymentTransactionDetails23 .class, CardPaymentTransactionDetails24 .class, CardPaymentTransactionDetails25 .class, CardPaymentTransactionDetails9 .class, CardPaymentTransactionResult2 .class, CardProductType1Code.class, Cardholder7 .class, Cardholder8 .class, CardholderAuthentication6 .class, CardholderVerificationCapability1Code.class, CertificateIssuer1 .class, ChargeType17Code.class, ChargeType8Code.class, ChargeTypeFormat3Choice.class, ChargesDetails2 .class, Commission18 .class, Commission19 .class, CommonData4 .class, CommunicationCharacteristics2 .class, Consignment2 .class, Contacts3 .class, ContentInformationType10 .class, ContentInformationType12 .class, ContentType2Code.class, CountryCodeAndName1 .class, CurrencyAndAmount.class, CurrencyConversion2 .class, CurrencyConversion3 .class, CurrencyConversionResponse1Code.class, CurrencyDetails1 .class, CustomerDevice1 .class, DataSetCategory1Code.class, DataSetIdentification1 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateFormat4Choice.class, DateType6Code.class, DetailedAmount4 .class, DetailedAmount6 .class, DetailedAmount7 .class, DigestedData4 .class, DiscountOrChargeType1Choice.class, DiscountType1Code.class, DiscountTypeFormat1Choice.class, DisplayCapabilities2 .class, DocumentGeneralInformation2 .class, DocumentIdentification22 .class, DocumentIdentification23 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification13 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification70 .class, GenericIdentification76 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Header12 .class, Incoterms3 .class, Incoterms4Choice.class, InformationType1Choice.class, InformationType1Code.class, InstalmentPlan1Code.class, InvoiceHeader1 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, LegalOrganisation1 .class, LineItem10 .class, LineItemAllowanceCharge1 .class, LineItemMonetarySummation1 .class, LineItemTax1 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCaaa01100104 .class, NamePrefix1Code.class, OnLineCapability1Code.class, OnLinePIN4 .class, OnLineReason1Code.class, Organisation8 .class, Organisation9 .class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, PINFormat3Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Packaging1 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, Party8Choice.class, PartyIdentification45 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard10 .class, PaymentCard11 .class, PaymentCard9 .class, PaymentContext12 .class, PaymentContext13 .class, PaymentTokenIdentifiers1 .class, Period1 .class, PersonIdentification5 .class, PersonIdentification7 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData7 .class, PlainCardData8 .class, PlainCardData9 .class, PointOfInteraction4 .class, PointOfInteractionCapabilities3 .class, PointOfInteractionComponent5 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus2 .class, PostalAddress13 .class, PostalAddress6 .class, Product1 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductCharacteristics2 .class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity3 .class, Quantity4 .class, Recipient4Choice.class, Recipient5Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, SignedData4 .class, Signer3 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TaxType15Code.class, TaxTypeFormat1Choice.class, Traceability2 .class, TrackData1 .class, TradeAgreement6 .class, TradeDelivery1 .class, TradeParty1 .class, TradeProduct1 .class, TransactionChannel3Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals3 .class, TransactionVerificationResult3 .class, TransportMeans3 .class, TypeOfAmount1Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure1Code.class, UserInterface1Code.class, UserInterface2Code.class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.04";

    public MxCaaa01100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100104(final String xml) {
        this();
        MxCaaa01100104 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV04 }
     *     
     */
    public AcceptorBatchTransferV04 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV04 }
     *     
     */
    public MxCaaa01100104 setAccptrBtchTrf(AcceptorBatchTransferV04 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCaaa01100104 parse(String xml) {
        return ((MxCaaa01100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100104 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100104) parserImpl.read(MxCaaa01100104 .class, xml, _classes));
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
     * Creates an MxCaaa01100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100104 message
     * @return
     *     a new instance of MxCaaa01100104
     */
    public final static MxCaaa01100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01100104 .class);
    }

}

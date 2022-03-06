
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
 * Class for caaa.011.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrBtchTrf"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.05")
public class MxCaaa01100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrBtchTrf", required = true)
    protected AcceptorBatchTransferV05 accptrBtchTrf;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 11;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorBatchTransferV05 .class, AccountingAccount1 .class, Acquirer4 .class, Acquirer5 .class, Action6 .class, ActionMessage2 .class, ActionMessage5 .class, ActionType3Code.class, AdditionalInformation1 .class, AdditionalInformation6 .class, AddressType2Code.class, AddressVerification1 .class, Adjustment6 .class, AdjustmentDirection1Code.class, AdjustmentType1Choice.class, AdjustmentType2Code.class, AggregationTransaction2 .class, Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AmountAndDirection41 .class, AttendanceContext1Code.class, AttendanceContext2Code.class, AttributeType1Code.class, AuthenticatedData4 .class, AuthenticationEntity2Code.class, AuthenticationMethod5Code.class, AuthenticationMethod6Code.class, AuthorisationResult10 .class, AuthorisationResult12 .class, BinaryFile1 .class, BytePadding1Code.class, CardAccountType3Code.class, CardDataReading5Code.class, CardFallback1Code.class, CardPaymentBatchTransfer4 .class, CardPaymentContext18 .class, CardPaymentContext19 .class, CardPaymentDataSet13 .class, CardPaymentDataSetTransaction14 .class, CardPaymentDataSetTransaction15 .class, CardPaymentDataSetTransaction16 .class, CardPaymentDataSetTransaction17 .class, CardPaymentDataSetTransaction4Choice.class, CardPaymentEnvironment51 .class, CardPaymentEnvironment52 .class, CardPaymentEnvironment53 .class, CardPaymentEnvironment54 .class, CardPaymentInvoice2 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType9Code.class, CardPaymentToken1 .class, CardPaymentToken2 .class, CardPaymentToken3 .class, CardPaymentTransaction52 .class, CardPaymentTransaction54 .class, CardPaymentTransaction60 .class, CardPaymentTransaction61 .class, CardPaymentTransaction62 .class, CardPaymentTransaction63 .class, CardPaymentTransactionDetails30 .class, CardPaymentTransactionDetails31 .class, CardPaymentTransactionDetails32 .class, CardPaymentTransactionDetails34 .class, CardPaymentTransactionResult3 .class, CardProductType1Code.class, Cardholder10 .class, Cardholder11 .class, CardholderAuthentication9 .class, CardholderVerificationCapability4Code.class, CertificateIssuer1 .class, ChargeType17Code.class, ChargeType8Code.class, ChargeTypeFormat3Choice.class, ChargesDetails4 .class, ChargesType1Choice.class, Commission18 .class, Commission19 .class, CommonData5 .class, CommunicationAddress5 .class, CommunicationCharacteristics2 .class, Consignment4 .class, Contacts3 .class, ContentInformationType10 .class, ContentInformationType12 .class, ContentType2Code.class, CountryCodeAndName1 .class, CurrencyAndAmount.class, CurrencyConversion6 .class, CurrencyConversion8 .class, CurrencyDetails1 .class, CustomerDevice1 .class, DataSetCategory8Code.class, DataSetIdentification5 .class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateFormat4Choice.class, DateType6Code.class, DetailedAmount14 .class, DetailedAmount15 .class, DetailedAmount4 .class, DigestedData4 .class, DiscountOrChargeType1Choice.class, DiscountType1Code.class, DiscountTypeFormat1Choice.class, DisplayCapabilities4 .class, DocumentGeneralInformation2 .class, DocumentIdentification22 .class, DocumentIdentification23 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification13 .class, GenericIdentification32 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericIdentification53 .class, GenericIdentification76 .class, GenericIdentification90 .class, GenericIdentification94 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Header25 .class, Incoterms3 .class, Incoterms4Choice.class, InformationType1Choice.class, InformationType1Code.class, InstalmentPlan1Code.class, InvoiceHeader2 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, LegalOrganisation1 .class, LineItem16 .class, LineItemAllowanceCharge2 .class, LineItemMonetarySummation1 .class, LineItemTax1 .class, LocationCategory1Code.class, LocationCategory3Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MxCaaa01100105 .class, NamePrefix1Code.class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, OnLineCapability1Code.class, OnLinePIN4 .class, OnLineReason1Code.class, Organisation25 .class, Organisation26 .class, Organisation9 .class, OrganisationIdentification7 .class, OrganisationIdentificationSchemeName1Choice.class, OutputFormat1Code.class, PINFormat3Code.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType4Code.class, Packaging1 .class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, Party10Choice.class, PartyIdentification112 .class, PartyType14Code.class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard19 .class, PaymentCard20 .class, PaymentCard21 .class, PaymentContext18 .class, PaymentContext19 .class, PaymentTokenIdentifiers1 .class, Period1 .class, PersonIdentification11 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData15 .class, PlainCardData16 .class, PlainCardData17 .class, PlainCardData8 .class, PointOfInteraction5 .class, PointOfInteractionCapabilities6 .class, PointOfInteractionComponent6 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus3 .class, PostalAddress18 .class, PostalAddress6 .class, Product3 .class, Product4 .class, Product5 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductCharacteristics3 .class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity10 .class, Quantity9 .class, Recipient4Choice.class, Recipient5Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response4Code.class, ResponseType5 .class, SaleContext2 .class, SignedData4 .class, Signer3 .class, SupportedPaymentOption1Code.class, TMSContactLevel1Code.class, TMSTrigger1 .class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TaxType15Code.class, TaxTypeFormat1Choice.class, Traceability5 .class, TradeAgreement13 .class, TradeDelivery2 .class, TradeParty3 .class, TradeProduct2 .class, TransactionChannel3Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionTotals7 .class, TransactionVerificationResult4 .class, TransportMeans3 .class, TypeOfAmount1Code.class, TypeTransactionTotals2Code.class, UnitOfMeasure3Choice.class, UnitOfMeasure6Code.class, UserInterface4Code.class, Vehicle1 .class, Vehicle2 .class, Verification1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.011.001.05";

    public MxCaaa01100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa01100105(final String xml) {
        this();
        MxCaaa01100105 tmp = parse(xml);
        accptrBtchTrf = tmp.getAccptrBtchTrf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa01100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrBtchTrf property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorBatchTransferV05 }
     *     
     */
    public AcceptorBatchTransferV05 getAccptrBtchTrf() {
        return accptrBtchTrf;
    }

    /**
     * Sets the value of the accptrBtchTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorBatchTransferV05 }
     *     
     */
    public MxCaaa01100105 setAccptrBtchTrf(AcceptorBatchTransferV05 value) {
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
    public static MxCaaa01100105 parse(String xml) {
        return ((MxCaaa01100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa01100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa01100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa01100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa01100105 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa01100105) parserImpl.read(MxCaaa01100105 .class, xml, _classes));
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
     * Creates an MxCaaa01100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa01100105 message
     * @return
     *     a new instance of MxCaaa01100105
     */
    public final static MxCaaa01100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa01100105 .class);
    }

}

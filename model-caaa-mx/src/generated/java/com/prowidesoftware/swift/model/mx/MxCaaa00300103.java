
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
 * Class for caaa.003.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "accptrCmpltnAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.003.001.03")
public class MxCaaa00300103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AccptrCmpltnAdvc", required = true)
    protected AcceptorCompletionAdviceV03 accptrCmpltnAdvc;
    public final static transient String BUSINESS_PROCESS = "caaa";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptorCompletionAdvice3 .class, AcceptorCompletionAdviceV03 .class, AccountingAccount1 .class, Acquirer2 .class, AdditionalInformation1 .class, AdditionalInformation6 .class, AddressType2Code.class, AddressVerification1 .class, Adjustment4 .class, AdjustmentDirection1Code.class, AdjustmentType2Code.class, Algorithm10Code.class, Algorithm5Code.class, Algorithm6Code.class, Algorithm7Code.class, Algorithm8Code.class, Algorithm9Code.class, AlgorithmIdentification10 .class, AlgorithmIdentification6 .class, AlgorithmIdentification7 .class, AlgorithmIdentification8 .class, AlgorithmIdentification9 .class, AttendanceContext1Code.class, AttributeType1Code.class, AuthenticatedData3 .class, AuthenticationEntity1Code.class, AuthenticationMethod2Code.class, AuthorisationResult2 .class, BinaryFile1 .class, CSCResult1Code.class, CardAccountType1Code.class, CardDataReading1Code.class, CardPaymentContext6 .class, CardPaymentEnvironment22 .class, CardPaymentInvoice1 .class, CardPaymentServiceType3Code.class, CardPaymentServiceType5Code.class, CardPaymentServiceType6Code.class, CardPaymentTransaction21 .class, CardPaymentTransaction25 .class, CardPaymentTransactionDetails14 .class, CardPaymentTransactionResult1 .class, Cardholder6 .class, CardholderAddressVerificationResult1Code.class, CardholderAuthentication4 .class, CardholderVerificationCapability1Code.class, CertificateIdentifier1 .class, CertificateIssuer1 .class, ChargeType17Code.class, ChargeType8Code.class, ChargeTypeFormat3Choice.class, ChargesDetails2 .class, Commission18 .class, Commission19 .class, CommunicationCharacteristics2 .class, Consignment2 .class, Contacts3 .class, ContentInformationType7 .class, ContentInformationType8 .class, ContentType1Code.class, CountryCodeAndName1 .class, CurrencyAndAmount.class, CurrencyConversion1 .class, CurrencyConversionResponse1Code.class, DateAndDateTimeChoice.class, DateAndPlaceOfBirth.class, DateFormat4Choice.class, DateType6Code.class, DetailedAmount4 .class, DetailedAmount5 .class, DiscountOrChargeType1Choice.class, DiscountType1Code.class, DiscountTypeFormat1Choice.class, DisplayCapabilities2 .class, DocumentGeneralInformation2 .class, DocumentIdentification22 .class, DocumentIdentification23 .class, EncapsulatedContent2 .class, EncryptedContent2 .class, EnvelopedData3 .class, FailureReason3Code.class, Frequency3Code.class, GenericIdentification13 .class, GenericIdentification31 .class, GenericIdentification32 .class, GenericIdentification33 .class, GenericIdentification4 .class, GenericIdentification48 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Header8 .class, Incoterms3 .class, Incoterms4Choice.class, InformationType1Choice.class, InformationType1Code.class, InstalmentPlan1Code.class, InvoiceHeader1 .class, IssuerAndSerialNumber1 .class, KEK3 .class, KEKIdentifier1 .class, KeyTransport3 .class, LegalOrganisation1 .class, LineItem10 .class, LineItemAllowanceCharge1 .class, LineItemMonetarySummation1 .class, LineItemTax1 .class, LocationCategory1Code.class, MemoryCharacteristics1 .class, MemoryUnit1Code.class, MessageFunction4Code.class, MxCaaa00300103 .class, NamePrefix1Code.class, OnLineCapability1Code.class, Organisation8 .class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, POICommunicationType1Code.class, POIComponentAssessment1Code.class, POIComponentStatus1Code.class, POIComponentType3Code.class, Packaging1 .class, Parameter1 .class, Parameter2 .class, Parameter3 .class, Party8Choice.class, PartyIdentification45 .class, PartyType3Code.class, PartyType4Code.class, PartyType7Code.class, PaymentCard8 .class, PaymentContext6 .class, Period1 .class, PersonIdentification5 .class, PersonIdentification7 .class, PersonIdentificationSchemeName1Choice.class, PlainCardData6 .class, PointOfInteraction3 .class, PointOfInteractionCapabilities2 .class, PointOfInteractionComponent4 .class, PointOfInteractionComponentAssessment1 .class, PointOfInteractionComponentCharacteristics2 .class, PointOfInteractionComponentIdentification1 .class, PointOfInteractionComponentStatus1 .class, PostalAddress6 .class, Product1 .class, ProductCategory1 .class, ProductCategory1Choice.class, ProductCategory1Code.class, ProductCharacteristics1 .class, ProductCharacteristics1Choice.class, ProductCharacteristics1Code.class, ProductCharacteristics2 .class, ProductIdentifier2 .class, ProductIdentifier2Choice.class, ProductIdentifier2Code.class, Quantity3 .class, Quantity4 .class, Recipient3Choice.class, RecurringTransaction2 .class, RelativeDistinguishedName1 .class, Response1Code.class, ResponseType1 .class, SaleContext1 .class, SupportedPaymentOption1Code.class, TaxExemptionReasonFormatChoice.class, TaxParty3 .class, TaxType15Code.class, TaxTypeFormat1Choice.class, Traceability1 .class, TrackData1 .class, TradeAgreement6 .class, TradeDelivery1 .class, TradeParty1 .class, TradeProduct1 .class, TransactionChannel1Code.class, TransactionEnvironment1Code.class, TransactionIdentifier1 .class, TransactionVerificationResult2 .class, TransportMeans3 .class, TypeOfAmount1Code.class, UnitOfMeasure1Code.class, UserInterface2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:caaa.003.001.03";

    public MxCaaa00300103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCaaa00300103(final String xml) {
        this();
        MxCaaa00300103 tmp = parse(xml);
        accptrCmpltnAdvc = tmp.getAccptrCmpltnAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCaaa00300103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the accptrCmpltnAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceV03 }
     *     
     */
    public AcceptorCompletionAdviceV03 getAccptrCmpltnAdvc() {
        return accptrCmpltnAdvc;
    }

    /**
     * Sets the value of the accptrCmpltnAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceV03 }
     *     
     */
    public MxCaaa00300103 setAccptrCmpltnAdvc(AcceptorCompletionAdviceV03 value) {
        this.accptrCmpltnAdvc = value;
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
    public static MxCaaa00300103 parse(String xml) {
        return ((MxCaaa00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCaaa00300103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCaaa00300103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCaaa00300103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCaaa00300103 parse(String xml, MxRead parserImpl) {
        return ((MxCaaa00300103) parserImpl.read(MxCaaa00300103 .class, xml, _classes));
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
     * Creates an MxCaaa00300103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCaaa00300103 message
     * @return
     *     a new instance of MxCaaa00300103
     */
    public final static MxCaaa00300103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCaaa00300103 .class);
    }

}


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
 * Class for remt.001.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rmtAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:remt.001.001.04")
public class MxRemt00100104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RmtAdvc", required = true)
    protected RemittanceAdviceV04 rmtAdvc;
    public static final transient String BUSINESS_PROCESS = "remt";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AmountType3Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, CopyDuplicate1Code.class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DiscountAmountAndType1 .class, DiscountAmountType1Choice.class, DocumentAdjustment1 .class, DocumentLineIdentification1 .class, DocumentLineInformation1 .class, DocumentLineType1 .class, DocumentLineType1Choice.class, DocumentType3Code.class, DocumentType6Code.class, EquivalentAmount2 .class, ExchangeRate1 .class, ExchangeRateType1Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Garnishment3 .class, GarnishmentType1 .class, GarnishmentType1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader79 .class, LocalInstrument2Choice.class, MxRemt00100104 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalPaymentInformation8 .class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PaymentTypeInformation26 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, Priority2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, ReferredDocumentInformation7 .class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, RemittanceAdviceV04 .class, RemittanceAmount2 .class, RemittanceAmount3 .class, RemittanceInformation19 .class, ServiceLevel8Choice.class, StructuredRemittanceInformation16 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxAmount2 .class, TaxAmountAndType1 .class, TaxAmountType1Choice.class, TaxAuthorisation1 .class, TaxInformation7 .class, TaxParty1 .class, TaxParty2 .class, TaxPeriod2 .class, TaxRecord2 .class, TaxRecordDetails2 .class, TaxRecordPeriod1Code.class, TransactionReferences5 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:remt.001.001.04";

    public MxRemt00100104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxRemt00100104(final String xml) {
        this();
        MxRemt00100104 tmp = parse(xml);
        rmtAdvc = tmp.getRmtAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxRemt00100104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rmtAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAdviceV04 }
     *     
     */
    public RemittanceAdviceV04 getRmtAdvc() {
        return rmtAdvc;
    }

    /**
     * Sets the value of the rmtAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAdviceV04 }
     *     
     */
    public MxRemt00100104 setRmtAdvc(RemittanceAdviceV04 value) {
        this.rmtAdvc = value;
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
    public static MxRemt00100104 parse(String xml) {
        return ((MxRemt00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxRemt00100104 parse(String xml, MxReadConfiguration conf) {
        return ((MxRemt00100104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxRemt00100104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxRemt00100104 parse(String xml, MxRead parserImpl) {
        return ((MxRemt00100104) parserImpl.read(MxRemt00100104 .class, xml, _classes));
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
     * Creates an MxRemt00100104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxRemt00100104 message
     * @return
     *     a new instance of MxRemt00100104
     */
    public static final MxRemt00100104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxRemt00100104 .class);
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

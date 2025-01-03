
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
 * Class for pain.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pain00100102"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.02")
public class MxPain00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "pain.001.001.02", required = true)
    protected Pain00100102 pain00100102;
    public static final transient String BUSINESS_PROCESS = "pain";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification3Choice.class, AddressType2Code.class, AmountType2Choice.class, BranchAndFinancialInstitutionIdentification3 .class, BranchData.class, CashAccount7 .class, CashAccountType2 .class, CashAccountType4Code.class, ChargeBearerType1Code.class, Cheque5 .class, ChequeDelivery1Code.class, ChequeDeliveryMethod1Choice.class, ChequeType2Code.class, ClearingChannel2Code.class, ClearingSystemMemberIdentification3Choice.class, CreditTransferTransactionInformation1 .class, CreditorReferenceInformation1 .class, CreditorReferenceType1 .class, CurrencyAndAmount.class, DateAndPlaceOfBirth.class, DocumentType2Code.class, DocumentType3Code.class, EquivalentAmount.class, ExchangeRateInformation1 .class, ExchangeRateType1Code.class, FinancialInstitutionIdentification3 .class, FinancialInstitutionIdentification5Choice.class, GenericIdentification3 .class, GenericIdentification4 .class, GroupHeader1 .class, Grouping1Code.class, Instruction3Code.class, InstructionForCreditorAgent1 .class, LocalInstrument1Choice.class, MxPain00100102 .class, NameAndAddress3 .class, NameAndAddress7 .class, OrganisationIdentification2 .class, Pain00100102 .class, Party2Choice.class, PartyIdentification8 .class, PaymentCategoryPurpose1Code.class, PaymentIdentification1 .class, PaymentInstructionInformation1 .class, PaymentMethod3Code.class, PaymentTypeInformation1 .class, PersonIdentification3 .class, PostalAddress1 .class, Priority2Code.class, Purpose1Choice.class, ReferredDocumentAmount1Choice.class, ReferredDocumentInformation1 .class, ReferredDocumentType1 .class, RegulatoryAuthority.class, RegulatoryReporting2 .class, RegulatoryReportingType1Code.class, RemittanceInformation1 .class, RemittanceLocation1 .class, RemittanceLocationMethod1Code.class, ServiceLevel1Code.class, ServiceLevel2Choice.class, SimpleIdentificationInformation2 .class, StructuredRegulatoryReporting2 .class, StructuredRemittanceInformation6 .class, TaxDetails.class, TaxInformation2 .class, TaxType.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.001.001.02";

    public MxPain00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00100102(final String xml) {
        this();
        MxPain00100102 tmp = parse(xml);
        pain00100102 = tmp.getPain00100102();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the pain00100102 property.
     * 
     * @return
     *     possible object is
     *     {@link Pain00100102 }
     *     
     */
    public Pain00100102 getPain00100102() {
        return pain00100102;
    }

    /**
     * Sets the value of the pain00100102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pain00100102 }
     *     
     */
    public MxPain00100102 setPain00100102(Pain00100102 value) {
        this.pain00100102 = value;
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
    public static MxPain00100102 parse(String xml) {
        return ((MxPain00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00100102 parse(String xml, MxRead parserImpl) {
        return ((MxPain00100102) parserImpl.read(MxPain00100102 .class, xml, _classes));
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
     * Creates an MxPain00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00100102 message
     * @return
     *     a new instance of MxPain00100102
     */
    public static final MxPain00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00100102 .class);
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

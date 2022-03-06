
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
 * Class for pain.001.003.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrCdtTrfInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03")
public class MxPain00100303
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrCdtTrfInitn", required = true)
    protected CustomerCreditTransferInitiation003V03SEPADFU cstmrCdtTrfInitn;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 3;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentificationSEPADFU1 .class, ActiveOrHistoricCurrencyAndAmountSEPADFU1 .class, ActiveOrHistoricCurrencyCodeEURDFU1 .class, AmountTypeSEPADFU1 .class, BranchAndFinancialInstitutionIdentificationSEPA1DFU1 .class, BranchAndFinancialInstitutionIdentificationSEPA3DFU1 .class, CashAccountSEPA1DFU1 .class, CashAccountSEPA2DFU1 .class, CategoryPurposeSEPADFU1 .class, ChargeBearerTypeSEPACodeDFU1 .class, CreditTransferTransactionInformationSCTDFU1 .class, CreditorReferenceInformationSEPA1DFU1 .class, CreditorReferenceTypeCodeSEPADFU1 .class, CreditorReferenceTypeSEPADFU1 .class, CustomerCreditTransferInitiation003V03SEPADFU.class, DateAndPlaceOfBirth.class, DocumentType3CodeSEPADFU1 .class, FinancialInstitutionIdentificationSEPA1DFU1 .class, FinancialInstitutionIdentificationSEPA3DFU1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeaderSCTDFU1 .class, MxPain00100303 .class, OrganisationIdentificationSEPAChoiceDFU1 .class, OrganisationIdentificationSchemeName1Choice.class, OthrIdentificationCodeDFU1 .class, OthrIdentificationDFU1 .class, PartyIdentificationSEPA1DFU1 .class, PartyIdentificationSEPA2DFU1 .class, PartySEPAChoiceDFU1 .class, PaymentIdentificationSEPADFU1 .class, PaymentInstructionInformationSCTDFU1 .class, PaymentMethodSCTCodeDFU1 .class, PaymentTypeInformationSCT1DFU1 .class, PaymentTypeInformationSCT2DFU1 .class, PersonIdentificationSEPA1ChoiceDFU1 .class, PersonIdentificationSchemeName1Choice.class, PostalAddressSEPADFU1 .class, Priority2Code.class, PurposeSEPADFU1 .class, RemittanceInformationSEPA1ChoiceDFU1 .class, ServiceLevelSEPADFU1 .class, StructuredRemittanceInformationSEPA1DFU1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.001.003.03";

    public MxPain00100303() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00100303(final String xml) {
        this();
        MxPain00100303 tmp = parse(xml);
        cstmrCdtTrfInitn = tmp.getCstmrCdtTrfInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00100303(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrCdtTrfInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditTransferInitiation003V03SEPADFU }
     *     
     */
    public CustomerCreditTransferInitiation003V03SEPADFU getCstmrCdtTrfInitn() {
        return cstmrCdtTrfInitn;
    }

    /**
     * Sets the value of the cstmrCdtTrfInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditTransferInitiation003V03SEPADFU }
     *     
     */
    public MxPain00100303 setCstmrCdtTrfInitn(CustomerCreditTransferInitiation003V03SEPADFU value) {
        this.cstmrCdtTrfInitn = value;
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
    public static MxPain00100303 parse(String xml) {
        return ((MxPain00100303) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00100303 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00100303 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00100303) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00100303 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00100303 parse(String xml, MxRead parserImpl) {
        return ((MxPain00100303) parserImpl.read(MxPain00100303 .class, xml, _classes));
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
     * Creates an MxPain00100303 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00100303 message
     * @return
     *     a new instance of MxPain00100303
     */
    public final static MxPain00100303 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00100303 .class);
    }

}

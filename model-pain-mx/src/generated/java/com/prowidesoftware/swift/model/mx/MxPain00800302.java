
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
 * Class for pain.008.003.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cstmrDrctDbtInitn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.008.003.02")
public class MxPain00800302
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CstmrDrctDbtInitn", required = true)
    protected CustomerDirectDebitInitiation003V02SEPADFU cstmrDrctDbtInitn;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 8;
    public final static transient int VARIANT = 3;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentificationSEPADFU1 .class, ActiveOrHistoricCurrencyAndAmountSEPADFU2 .class, ActiveOrHistoricCurrencyCodeEURDFU1 .class, AmendmentInformationDetailsSDDDFU1 .class, BranchAndFinancialInstitutionIdentificationSEPA2DFU1 .class, BranchAndFinancialInstitutionIdentificationSEPA3DFU1 .class, CashAccountSEPA1DFU1 .class, CashAccountSEPA2DFU1 .class, CategoryPurposeSEPADFU1 .class, ChargeBearerTypeSEPACodeDFU1 .class, CreditorReferenceInformationSEPA1DFU1 .class, CreditorReferenceTypeCodeSEPADFU1 .class, CreditorReferenceTypeSEPADFU1 .class, CustomerDirectDebitInitiation003V02SEPADFU.class, DateAndPlaceOfBirth.class, DirectDebitTransactionInformationSDDDFU1 .class, DirectDebitTransactionSDDDFU1 .class, DocumentType3CodeSEPADFU1 .class, FinancialInstitutionIdentificationSEPA2DFU1 .class, FinancialInstitutionIdentificationSEPA3DFU1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeaderSDDDFU1 .class, IdentificationSchemeNameSEPADFU1 .class, LocalInstrumentSEPADFU1 .class, MandateRelatedInformationSDDDFU1 .class, MxPain00800302 .class, OrganisationIdentificationSEPAChoiceDFU1 .class, OrganisationIdentificationSchemeName1Choice.class, OthrIdentificationCodeDFU1 .class, OthrIdentificationDFU1 .class, PartyIdentificationSEPA1DFU1 .class, PartyIdentificationSEPA2DFU1 .class, PartyIdentificationSEPA3DFU1 .class, PartyIdentificationSEPA4DFU1 .class, PartyIdentificationSEPA5DFU1 .class, PartySEPA2DFU1 .class, PartySEPAChoiceDFU1 .class, PaymentIdentificationSEPADFU1 .class, PaymentInstructionInformationSDDDFU1 .class, PaymentMethod2Code.class, PaymentTypeInformationSDDDFU1 .class, PersonIdentificationSEPA1ChoiceDFU1 .class, PersonIdentificationSEPA2DFU1 .class, PersonIdentificationSchemeName1Choice.class, PostalAddressSEPADFU1 .class, PurposeSEPADFU1 .class, RemittanceInformationSEPA1ChoiceDFU1 .class, RestrictedFinancialIdentificationSEPADFU1 .class, RestrictedPersonIdentificationSEPADFU1 .class, RestrictedPersonIdentificationSchemeNameSEPADFU1 .class, RestrictedSMNDACodeDFU1 .class, SequenceType1Code.class, ServiceLevelSEPADFU1 .class, StructuredRemittanceInformationSEPA1DFU1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.008.003.02";

    public MxPain00800302() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00800302(final String xml) {
        this();
        MxPain00800302 tmp = parse(xml);
        cstmrDrctDbtInitn = tmp.getCstmrDrctDbtInitn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00800302(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cstmrDrctDbtInitn property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDirectDebitInitiation003V02SEPADFU }
     *     
     */
    public CustomerDirectDebitInitiation003V02SEPADFU getCstmrDrctDbtInitn() {
        return cstmrDrctDbtInitn;
    }

    /**
     * Sets the value of the cstmrDrctDbtInitn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDirectDebitInitiation003V02SEPADFU }
     *     
     */
    public MxPain00800302 setCstmrDrctDbtInitn(CustomerDirectDebitInitiation003V02SEPADFU value) {
        this.cstmrDrctDbtInitn = value;
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
    public static MxPain00800302 parse(String xml) {
        return ((MxPain00800302) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800302 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00800302 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00800302) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00800302 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00800302 parse(String xml, MxRead parserImpl) {
        return ((MxPain00800302) parserImpl.read(MxPain00800302 .class, xml, _classes));
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
     * Creates an MxPain00800302 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00800302 message
     * @return
     *     a new instance of MxPain00800302
     */
    public final static MxPain00800302 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00800302 .class);
    }

}

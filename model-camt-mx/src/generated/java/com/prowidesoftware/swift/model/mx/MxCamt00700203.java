
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
 * Class for camt.007.002.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "reqToModfyPmt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.007.002.03")
public class MxCamt00700203
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ReqToModfyPmt", required = true)
    protected RequestToModifyPaymentV03Camt00700203 reqToModfyPmt;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 7;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AmountType3Choice.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, Case2 .class, CaseAssignment2 .class, CashAccount16 .class, CashAccountType2 .class, CashAccountType4Code.class, CategoryPurpose1Choice.class, ChargeBearerType1Code.class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, CreditorReferenceInformation2 .class, CreditorReferenceType1Choice.class, CreditorReferenceType2 .class, DateAndPlaceOfBirth.class, DocumentAdjustment1 .class, DocumentType3Code.class, DocumentType5Code.class, EquivalentAmount2 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Instruction3Code.class, Instruction4Code.class, InstructionForCreditorAgent1 .class, InstructionForNextAgent1 .class, LocalInstrument2Choice.class, MxCamt00700203 .class, NamePrefix1Code.class, OrganisationIdentification4 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalGroupInformation3 .class, Party6Choice.class, Party7Choice.class, PartyIdentification32 .class, PaymentTypeInformation22 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, Priority2Code.class, Purpose2Choice.class, ReferredDocumentInformation3 .class, ReferredDocumentType1Choice.class, ReferredDocumentType2 .class, RemittanceAmount1 .class, RemittanceInformation5 .class, RequestToModifyPaymentV03Camt00700203 .class, RequestedModification2 .class, SequenceType1Code.class, ServiceLevel8Choice.class, SettlementInformation15 .class, StructuredRemittanceInformation7 .class, UnderlyingGroupInformation1 .class, UnderlyingPaymentInstruction1 .class, UnderlyingPaymentTransaction1 .class, UnderlyingStatementEntry1 .class, UnderlyingTransaction1Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.007.002.03";

    public MxCamt00700203() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00700203(final String xml) {
        this();
        MxCamt00700203 tmp = parse(xml);
        reqToModfyPmt = tmp.getReqToModfyPmt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00700203(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the reqToModfyPmt property.
     * 
     * @return
     *     possible object is
     *     {@link RequestToModifyPaymentV03Camt00700203 }
     *     
     */
    public RequestToModifyPaymentV03Camt00700203 getReqToModfyPmt() {
        return reqToModfyPmt;
    }

    /**
     * Sets the value of the reqToModfyPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestToModifyPaymentV03Camt00700203 }
     *     
     */
    public MxCamt00700203 setReqToModfyPmt(RequestToModifyPaymentV03Camt00700203 value) {
        this.reqToModfyPmt = value;
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
    public static MxCamt00700203 parse(String xml) {
        return ((MxCamt00700203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00700203 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00700203) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00700203 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00700203 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00700203) parserImpl.read(MxCamt00700203 .class, xml, _classes));
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
     * Creates an MxCamt00700203 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00700203 message
     * @return
     *     a new instance of MxCamt00700203
     */
    public static final MxCamt00700203 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00700203 .class);
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

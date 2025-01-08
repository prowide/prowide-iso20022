
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
 * Class for pain.011.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mndtCxlReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.011.001.07")
public class MxPain01100107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MndtCxlReq", required = true)
    protected MandateCancellationRequestV07 mndtCxlReq;
    public static final transient String BUSINESS_PROCESS = "pain";
    public static final transient int FUNCTIONALITY = 11;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AuthenticationChannel1Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact4 .class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, DocumentType6Code.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, Frequency10Code.class, Frequency36Choice.class, Frequency37Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GroupHeader80 .class, LocalInstrument2Choice.class, Mandate17 .class, MandateAdjustment1 .class, MandateAuthentication1 .class, MandateCancellation7 .class, MandateCancellationReason1 .class, MandateCancellationRequestV07 .class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateOccurrences5 .class, MandateReason1Choice.class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxPain01100107 .class, NamePrefix2Code.class, OrganisationIdentification29 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalMandate9Choice.class, OriginalMessageInformation1 .class, OtherContact1 .class, Party38Choice.class, PartyIdentification135 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress24 .class, PreferredContactMethod1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, ReferredDocumentType3Choice.class, ReferredDocumentType4 .class, ReferredMandateDocument1 .class, SequenceType2Code.class, ServiceLevel8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.011.001.07";

    public MxPain01100107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain01100107(final String xml) {
        this();
        MxPain01100107 tmp = parse(xml);
        mndtCxlReq = tmp.getMndtCxlReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain01100107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mndtCxlReq property.
     * 
     * @return
     *     possible object is
     *     {@link MandateCancellationRequestV07 }
     *     
     */
    public MandateCancellationRequestV07 getMndtCxlReq() {
        return mndtCxlReq;
    }

    /**
     * Sets the value of the mndtCxlReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateCancellationRequestV07 }
     *     
     */
    public MxPain01100107 setMndtCxlReq(MandateCancellationRequestV07 value) {
        this.mndtCxlReq = value;
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
    public static MxPain01100107 parse(String xml) {
        return ((MxPain01100107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01100107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain01100107 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain01100107) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain01100107 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain01100107 parse(String xml, MxRead parserImpl) {
        return ((MxPain01100107) parserImpl.read(MxPain01100107 .class, xml, _classes));
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
     * Creates an MxPain01100107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain01100107 message
     * @return
     *     a new instance of MxPain01100107
     */
    public static final MxPain01100107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain01100107 .class);
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

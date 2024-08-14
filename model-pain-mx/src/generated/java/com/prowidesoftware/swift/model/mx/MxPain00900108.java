
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
 * Class for pain.009.001.08 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mndtInitnReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:pain.009.001.08")
public class MxPain00900108
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MndtInitnReq", required = true)
    protected MandateInitiationRequestV08 mndtInitnReq;
    public final static transient String BUSINESS_PROCESS = "pain";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 8;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, AuthenticationChannel1Choice.class, Authorisation1Choice.class, Authorisation1Code.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountType2Choice.class, CategoryPurpose1Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, DateAndPlaceOfBirth1 .class, DateAndType1 .class, DatePeriod3 .class, DateType2Choice.class, DocumentType1 .class, DocumentType2Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency10Code.class, Frequency36Choice.class, Frequency37Choice.class, Frequency6Code.class, FrequencyAndMoment1 .class, FrequencyPeriod1 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, GroupHeader110 .class, LocalInstrument2Choice.class, Mandate23 .class, MandateAdjustment1 .class, MandateAuthentication1 .class, MandateClassification1Choice.class, MandateClassification1Code.class, MandateInitiationRequestV08 .class, MandateOccurrences5 .class, MandateSetupReason1Choice.class, MandateTypeInformation2 .class, MxPain00900108 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, ReferredMandateDocument2 .class, SequenceType2Code.class, ServiceLevel8Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:pain.009.001.08";

    public MxPain00900108() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxPain00900108(final String xml) {
        this();
        MxPain00900108 tmp = parse(xml);
        mndtInitnReq = tmp.getMndtInitnReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxPain00900108(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mndtInitnReq property.
     * 
     * @return
     *     possible object is
     *     {@link MandateInitiationRequestV08 }
     *     
     */
    public MandateInitiationRequestV08 getMndtInitnReq() {
        return mndtInitnReq;
    }

    /**
     * Sets the value of the mndtInitnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateInitiationRequestV08 }
     *     
     */
    public MxPain00900108 setMndtInitnReq(MandateInitiationRequestV08 value) {
        this.mndtInitnReq = value;
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
    public static MxPain00900108 parse(String xml) {
        return ((MxPain00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxPain00900108 parse(String xml, MxReadConfiguration conf) {
        return ((MxPain00900108) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxPain00900108 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxPain00900108 parse(String xml, MxRead parserImpl) {
        return ((MxPain00900108) parserImpl.read(MxPain00900108 .class, xml, _classes));
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
     * Creates an MxPain00900108 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxPain00900108 message
     * @return
     *     a new instance of MxPain00900108
     */
    public final static MxPain00900108 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxPain00900108 .class);
    }

}


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
 * Class for auth.001.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "infReqOpng"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.001.001.02")
public class MxAuth00100102
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "InfReqOpng", required = true)
    protected InformationRequestOpeningV02 infReqOpng;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 1;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountAndParties3 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AddressType3Choice.class, AuthorityInvestigation2 .class, AuthorityRequestType1 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount43 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CustomerIdentification2 .class, DateAndPlaceOfBirth1 .class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DueDate1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, InformationRequestOpeningV02 .class, InvestigatedParties1Choice.class, InvestigatedParties1Code.class, LegalMandate1 .class, MxAuth00100102 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PaymentInstrumentType1 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RequestType1 .class, SearchCriteria2Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionRequestType1Code.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.001.001.02";

    public MxAuth00100102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth00100102(final String xml) {
        this();
        MxAuth00100102 tmp = parse(xml);
        infReqOpng = tmp.getInfReqOpng();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth00100102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the infReqOpng property.
     * 
     * @return
     *     possible object is
     *     {@link InformationRequestOpeningV02 }
     *     
     */
    public InformationRequestOpeningV02 getInfReqOpng() {
        return infReqOpng;
    }

    /**
     * Sets the value of the infReqOpng property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationRequestOpeningV02 }
     *     
     */
    public MxAuth00100102 setInfReqOpng(InformationRequestOpeningV02 value) {
        this.infReqOpng = value;
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
    public static MxAuth00100102 parse(String xml) {
        return ((MxAuth00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth00100102 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth00100102) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth00100102 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth00100102 parse(String xml, MxRead parserImpl) {
        return ((MxAuth00100102) parserImpl.read(MxAuth00100102 .class, xml, _classes));
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
     * Creates an MxAuth00100102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth00100102 message
     * @return
     *     a new instance of MxAuth00100102
     */
    public static final MxAuth00100102 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth00100102 .class);
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

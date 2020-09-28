
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for auth.001.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "infReqOpng"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.001.001.01")
public class MxAuth00100101
    extends AbstractMX
{

    @XmlElement(name = "InfReqOpng", required = true)
    protected InformationRequestOpeningV01 infReqOpng;
    public final static transient String BUSINESS_PROCESS = "auth";
    public final static transient int FUNCTIONALITY = 1;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountAndParties1 .class, AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AddressType2Code.class, AuthorityInvestigation2 .class, AuthorityRequestType1 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount25 .class, CashAccountType2Choice.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CustomerIdentification1 .class, DateAndPlaceOfBirth.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DueDate1 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, InformationRequestOpeningV01 .class, InvestigatedParties1Choice.class, InvestigatedParties1Code.class, LegalMandate1 .class, MxAuth00100101 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification43 .class, PaymentInstrumentType1 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, RequestType1 .class, SearchCriteria1Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TransactionRequestType1Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.001.001.01";

    public MxAuth00100101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth00100101(final String xml) {
        this();
        MxAuth00100101 tmp = parse(xml);
        infReqOpng = tmp.getInfReqOpng();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth00100101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the infReqOpng property.
     * 
     * @return
     *     possible object is
     *     {@link InformationRequestOpeningV01 }
     *     
     */
    public InformationRequestOpeningV01 getInfReqOpng() {
        return infReqOpng;
    }

    /**
     * Sets the value of the infReqOpng property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationRequestOpeningV01 }
     *     
     */
    public MxAuth00100101 setInfReqOpng(InformationRequestOpeningV01 value) {
        this.infReqOpng = value;
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxAuth00100101 parse(String xml) {
        return ((MxAuth00100101) MxReadImpl.parse(MxAuth00100101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth00100101 parse(String xml, MxRead parserImpl) {
        return ((MxAuth00100101) parserImpl.read(MxAuth00100101 .class, xml, _classes));
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
     * Creates an MxAuth00100101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth00100101 message
     * @return
     *     a new instance of MxAuth00100101
     */
    public final static MxAuth00100101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxAuth00100101 .class);
    }

}

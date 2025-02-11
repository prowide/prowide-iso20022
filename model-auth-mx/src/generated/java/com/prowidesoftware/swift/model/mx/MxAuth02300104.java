
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
 * Class for auth.023.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ctrctRegnStmtReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.023.001.04")
public class MxAuth02300104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CtrctRegnStmtReq", required = true)
    protected ContractRegistrationStatementRequestV04 ctrctRegnStmtReq;
    public static final transient String BUSINESS_PROCESS = "auth";
    public static final transient int FUNCTIONALITY = 23;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, AddressType3Choice.class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, ContractRegistrationStatementCriteria1 .class, ContractRegistrationStatementRequest3 .class, ContractRegistrationStatementRequestV04 .class, CurrencyControlHeader8 .class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, LegalOrganisation2 .class, MxAuth02300104 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, QueryType3Code.class, ReportingPeriod4 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, TaxExemptionReasonFormat1Choice.class, TaxParty4 .class, TimePeriod2 .class, TradeParty6 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:auth.023.001.04";

    public MxAuth02300104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAuth02300104(final String xml) {
        this();
        MxAuth02300104 tmp = parse(xml);
        ctrctRegnStmtReq = tmp.getCtrctRegnStmtReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAuth02300104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the ctrctRegnStmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationStatementRequestV04 }
     *     
     */
    public ContractRegistrationStatementRequestV04 getCtrctRegnStmtReq() {
        return ctrctRegnStmtReq;
    }

    /**
     * Sets the value of the ctrctRegnStmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationStatementRequestV04 }
     *     
     */
    public MxAuth02300104 setCtrctRegnStmtReq(ContractRegistrationStatementRequestV04 value) {
        this.ctrctRegnStmtReq = value;
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
    public static MxAuth02300104 parse(String xml) {
        return ((MxAuth02300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAuth02300104 parse(String xml, MxReadConfiguration conf) {
        return ((MxAuth02300104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAuth02300104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAuth02300104 parse(String xml, MxRead parserImpl) {
        return ((MxAuth02300104) parserImpl.read(MxAuth02300104 .class, xml, _classes));
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
     * Creates an MxAuth02300104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAuth02300104 message
     * @return
     *     a new instance of MxAuth02300104
     */
    public static final MxAuth02300104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAuth02300104 .class);
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

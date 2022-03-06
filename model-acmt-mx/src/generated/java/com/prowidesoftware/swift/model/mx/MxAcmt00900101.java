
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
 * Class for acmt.009.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctOpngAddtlInfReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.009.001.01")
public class MxAcmt00900101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctOpngAddtlInfReq", required = true)
    protected AccountOpeningAdditionalInformationRequestV01 acctOpngAddtlInfReq;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountOpeningAdditionalInformationRequestV01 .class, AccountSchemeName1Choice.class, AccountStatus3Code.class, AddressType2Code.class, BranchAndFinancialInstitutionIdentification4 .class, BranchData2 .class, CashAccountType2 .class, CashAccountType4Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CodeOrProprietary1Choice.class, ContactDetails2 .class, ContractDocument1 .class, CustomerAccount1 .class, DateAndPlaceOfBirth.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification7 .class, Frequency3Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification13 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, MessageIdentification1 .class, MxAcmt00900101 .class, NamePrefix1Code.class, OrganisationIdentification6 .class, OrganisationIdentificationSchemeName1Choice.class, Party8Choice.class, PartyAndSignature1 .class, PartyIdentification41 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProprietaryData3 .class, References3 .class, Restriction1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.009.001.01";

    public MxAcmt00900101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00900101(final String xml) {
        this();
        MxAcmt00900101 tmp = parse(xml);
        acctOpngAddtlInfReq = tmp.getAcctOpngAddtlInfReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00900101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctOpngAddtlInfReq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOpeningAdditionalInformationRequestV01 }
     *     
     */
    public AccountOpeningAdditionalInformationRequestV01 getAcctOpngAddtlInfReq() {
        return acctOpngAddtlInfReq;
    }

    /**
     * Sets the value of the acctOpngAddtlInfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOpeningAdditionalInformationRequestV01 }
     *     
     */
    public MxAcmt00900101 setAcctOpngAddtlInfReq(AccountOpeningAdditionalInformationRequestV01 value) {
        this.acctOpngAddtlInfReq = value;
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
    public static MxAcmt00900101 parse(String xml) {
        return ((MxAcmt00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxAcmt00900101 parse(String xml, MxReadConfiguration conf) {
        return ((MxAcmt00900101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxAcmt00900101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00900101 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00900101) parserImpl.read(MxAcmt00900101 .class, xml, _classes));
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
     * Creates an MxAcmt00900101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00900101 message
     * @return
     *     a new instance of MxAcmt00900101
     */
    public final static MxAcmt00900101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00900101 .class);
    }

}

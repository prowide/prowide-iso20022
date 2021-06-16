
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
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.003.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.003.001.05")
public class MxCamt00300105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "GetAcct", required = true)
    protected GetAccountV05 getAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCriteria1Choice.class, AccountCriteria5 .class, AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountQuery1 .class, AccountSchemeName1Choice.class, AddressType2Code.class, BalanceCounterparty1Code.class, BalanceType8Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccountReturnCriteria3 .class, CashAccountSearchCriteria5 .class, CashAccountType2Choice.class, CashBalance4 .class, CashBalanceReturnCriteria.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndDateTimeSearchChoice.class, DateAndPlaceOfBirth.class, DatePeriodDetails.class, DateSearchChoice.class, DateTimePeriodChoice.class, DateTimePeriodDetails.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GetAccountV05 .class, MessageHeader2 .class, MxCamt00300105 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party11Choice.class, PartyIdentification43 .class, PersonIdentification5 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, QueryType2Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, SystemBalanceType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.003.001.05";

    public MxCamt00300105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00300105(final String xml) {
        this();
        MxCamt00300105 tmp = parse(xml);
        getAcct = tmp.getGetAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00300105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcct property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountV05 }
     *     
     */
    public GetAccountV05 getGetAcct() {
        return getAcct;
    }

    /**
     * Sets the value of the getAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountV05 }
     *     
     */
    public MxCamt00300105 setGetAcct(GetAccountV05 value) {
        this.getAcct = value;
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
    public static MxCamt00300105 parse(String xml) {
        return ((MxCamt00300105) MxReadImpl.parse(MxCamt00300105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00300105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00300105) parserImpl.read(MxCamt00300105 .class, xml, _classes));
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
     * Creates an MxCamt00300105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00300105 message
     * @return
     *     a new instance of MxCamt00300105
     */
    public final static MxCamt00300105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00300105 .class);
    }

}


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
 * Class for camt.003.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "getAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.003.001.06")
public class MxCamt00300106
    extends AbstractMX
{

    @XmlElement(name = "GetAcct", required = true)
    protected GetAccountV06 getAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 3;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountCriteria2Choice.class, AccountCriteria6 .class, AccountIdentification4Choice.class, AccountIdentificationSearchCriteria2Choice.class, AccountQuery2 .class, AccountSchemeName1Choice.class, AddressType2Code.class, BalanceCounterparty1Code.class, BalanceType8Choice.class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccountReturnCriteria4 .class, CashAccountSearchCriteria6 .class, CashAccountType2Choice.class, CashBalance9 .class, CashBalanceReturnCriteria1 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, DateAndDateTimeSearch3Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod2 .class, DatePeriodSearch1Choice.class, DateTimePeriod1 .class, DateTimePeriod1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, GetAccountV06 .class, MessageHeader9 .class, MxCamt00300106 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, Party34Choice.class, PartyIdentification125 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, QueryType2Code.class, RequestType4Choice.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemBalanceType1Code.class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.003.001.06";

    public MxCamt00300106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00300106(final String xml) {
        this();
        MxCamt00300106 tmp = parse(xml);
        getAcct = tmp.getGetAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00300106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the getAcct property.
     * 
     * @return
     *     possible object is
     *     {@link GetAccountV06 }
     *     
     */
    public GetAccountV06 getGetAcct() {
        return getAcct;
    }

    /**
     * Sets the value of the getAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetAccountV06 }
     *     
     */
    public MxCamt00300106 setGetAcct(GetAccountV06 value) {
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
    public static MxCamt00300106 parse(String xml) {
        return ((MxCamt00300106) MxReadImpl.parse(MxCamt00300106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00300106 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00300106) parserImpl.read(MxCamt00300106 .class, xml, _classes));
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
     * Creates an MxCamt00300106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00300106 message
     * @return
     *     a new instance of MxCamt00300106
     */
    public final static MxCamt00300106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt00300106 .class);
    }

}

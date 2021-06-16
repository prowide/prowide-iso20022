
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
 * Class for camt.004.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.004.001.07")
public class MxCamt00400107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrAcct", required = true)
    protected ReturnAccountV07 rtrAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountOrBusinessError3Choice.class, AccountOrOperationalError3Choice.class, AccountReport21 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, Amount2Choice.class, BalanceRestrictionType1 .class, BalanceStatus1Code.class, BalanceType8Choice.class, BalanceType9Choice.class, BilateralLimit2 .class, BranchAndFinancialInstitutionIdentification5 .class, BranchData2 .class, CashAccount24 .class, CashAccount35 .class, CashAccountType2Choice.class, CashBalance10 .class, CashBalance11 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, ContactDetails2 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriodDetails1 .class, ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification8 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericOrganisationIdentification1 .class, GenericPersonIdentification1 .class, Limit5 .class, MessageHeader7 .class, MxCamt00400107 .class, NamePrefix1Code.class, OrganisationIdentification8 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, Party34Choice.class, PartyIdentification125 .class, PersonIdentification13 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress6 .class, ProcessingType1Choice.class, ProcessingType1Code.class, RequestType4Choice.class, ReturnAccountV07 .class, StandingOrder2 .class, StandingOrderTotalAmount1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemBalanceType1Code.class, SystemBalanceType2Code.class, TotalAmountAndCurrency1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.004.001.07";

    public MxCamt00400107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400107(final String xml) {
        this();
        MxCamt00400107 tmp = parse(xml);
        rtrAcct = tmp.getRtrAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAccountV07 }
     *     
     */
    public ReturnAccountV07 getRtrAcct() {
        return rtrAcct;
    }

    /**
     * Sets the value of the rtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAccountV07 }
     *     
     */
    public MxCamt00400107 setRtrAcct(ReturnAccountV07 value) {
        this.rtrAcct = value;
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
    public static MxCamt00400107 parse(String xml) {
        return ((MxCamt00400107) MxReadImpl.parse(MxCamt00400107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400107 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400107) parserImpl.read(MxCamt00400107 .class, xml, _classes));
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
     * Creates an MxCamt00400107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400107 message
     * @return
     *     a new instance of MxCamt00400107
     */
    public final static MxCamt00400107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00400107 .class);
    }

}

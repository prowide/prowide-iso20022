
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
 * Class for camt.004.001.10 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrAcct"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.004.001.10")
public class MxCamt00400110
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrAcct", required = true)
    protected ReturnAccountV10 rtrAcct;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 4;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 10;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountOrBusinessError6Choice.class, AccountOrOperationalError6Choice.class, AccountReport35 .class, AccountSchemeName1Choice.class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, BalanceRestrictionType1 .class, BalanceStatus1Code.class, BalanceType11Choice.class, BalanceType9Choice.class, BilateralLimit4 .class, BranchAndFinancialInstitutionIdentification8 .class, BranchData5 .class, CashAccount40 .class, CashAccountData1 .class, CashAccountType2Choice.class, CashBalance11 .class, CashBalance13 .class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, Contact13 .class, CreditDebitCode.class, DateAndDateTime2Choice.class, DateAndPlaceOfBirth1 .class, DatePeriod3 .class, ErrorHandling3Choice.class, ErrorHandling5 .class, EventType1Choice.class, ExecutionType1Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification23 .class, Frequency2Code.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification1 .class, GenericIdentification30 .class, GenericOrganisationIdentification3 .class, GenericPersonIdentification2 .class, Limit5 .class, MessageHeader7 .class, MxCamt00400110 .class, NamePrefix2Code.class, OrganisationIdentification39 .class, OrganisationIdentificationSchemeName1Choice.class, OriginalBusinessQuery1 .class, OtherContact1 .class, Party52Choice.class, PartyIdentification272 .class, PersonIdentification18 .class, PersonIdentificationSchemeName1Choice.class, PostalAddress27 .class, PreferredContactMethod2Code.class, ProcessingType1Choice.class, ProcessingType1Code.class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, RequestType4Choice.class, ReturnAccountV10 .class, StandingOrder11 .class, StandingOrderTotalAmount1 .class, StandingOrderType1Choice.class, StandingOrderType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemBalanceType2Code.class, TotalAmountAndCurrency1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.004.001.10";

    public MxCamt00400110() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt00400110(final String xml) {
        this();
        MxCamt00400110 tmp = parse(xml);
        rtrAcct = tmp.getRtrAcct();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt00400110(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnAccountV10 }
     *     
     */
    public ReturnAccountV10 getRtrAcct() {
        return rtrAcct;
    }

    /**
     * Sets the value of the rtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnAccountV10 }
     *     
     */
    public MxCamt00400110 setRtrAcct(ReturnAccountV10 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt00400110 parse(String xml) {
        return ((MxCamt00400110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt00400110 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt00400110) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt00400110 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt00400110 parse(String xml, MxRead parserImpl) {
        return ((MxCamt00400110) parserImpl.read(MxCamt00400110 .class, xml, _classes));
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
     * Creates an MxCamt00400110 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt00400110 message
     * @return
     *     a new instance of MxCamt00400110
     */
    public final static MxCamt00400110 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt00400110 .class);
    }

}

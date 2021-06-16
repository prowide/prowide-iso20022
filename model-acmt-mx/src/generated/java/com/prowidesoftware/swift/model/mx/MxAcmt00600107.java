
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
 * Class for acmt.006.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "acctMgmtStsRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07")
public class MxAcmt00600107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "AcctMgmtStsRpt", required = true)
    protected AccountManagementStatusReportV07 acctMgmtStsRpt;
    public final static transient String BUSINESS_PROCESS = "acmt";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AcceptedStatusReason1Choice.class, AcceptedStatusReason1Code.class, Account23 .class, AccountManagementStatus1Code.class, AccountManagementStatusAndReason5 .class, AccountManagementStatusReportV07 .class, AccountStatus2 .class, AdditionalReference13 .class, AddressType2Code.class, BlockedReason2Choice.class, BlockedReason2Code.class, BlockedStatusReason2 .class, BlockedStatusReason2Choice.class, ClosedStatusReason1 .class, ClosedStatusReason1Choice.class, ClosedStatusReason1Code.class, ClosedStatusReason2Choice.class, ClosurePendingStatusReason1 .class, ClosurePendingStatusReason1Choice.class, ClosurePendingStatusReason1Code.class, ClosurePendingStatusReason2Choice.class, DisabledReason2Code.class, DisabledStatusReason1 .class, DisabledStatusReason1Choice.class, DisabledStatusReason2Choice.class, EnabledStatusReason1 .class, EnabledStatusReason1Choice.class, EnabledStatusReason1Code.class, EnabledStatusReason2Choice.class, Extension1 .class, GenericIdentification1 .class, GenericIdentification36 .class, GenericIdentification47 .class, InvestmentFundTransactionType1Code.class, MarketPracticeVersion1 .class, MessageIdentification1 .class, MxAcmt00600107 .class, NameAndAddress5 .class, NoReasonCode.class, OtherAccountStatus1 .class, PartyIdentification125Choice.class, PendingOpeningStatusReason1 .class, PendingOpeningStatusReason1Choice.class, PendingOpeningStatusReason1Code.class, PendingOpeningStatusReason2Choice.class, PendingStatusReason14 .class, PendingStatusReason1Choice.class, PendingStatusReason1Code.class, PendingStatusReason2Choice.class, PostalAddress1 .class, ProformaStatusReason1 .class, ProformaStatusReason1Choice.class, ProformaStatusReason1Code.class, ProformaStatusReason2Choice.class, RejectedReason16Choice.class, RejectedStatusReason6Code.class, RejectionReason31 .class, Status25Choice.class, TransactionType5Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07";

    public MxAcmt00600107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxAcmt00600107(final String xml) {
        this();
        MxAcmt00600107 tmp = parse(xml);
        acctMgmtStsRpt = tmp.getAcctMgmtStsRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxAcmt00600107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the acctMgmtStsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatusReportV07 }
     *     
     */
    public AccountManagementStatusReportV07 getAcctMgmtStsRpt() {
        return acctMgmtStsRpt;
    }

    /**
     * Sets the value of the acctMgmtStsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatusReportV07 }
     *     
     */
    public MxAcmt00600107 setAcctMgmtStsRpt(AccountManagementStatusReportV07 value) {
        this.acctMgmtStsRpt = value;
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
    public static MxAcmt00600107 parse(String xml) {
        return ((MxAcmt00600107) MxReadImpl.parse(MxAcmt00600107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxAcmt00600107 parse(String xml, MxRead parserImpl) {
        return ((MxAcmt00600107) parserImpl.read(MxAcmt00600107 .class, xml, _classes));
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
     * Creates an MxAcmt00600107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxAcmt00600107 message
     * @return
     *     a new instance of MxAcmt00600107
     */
    public final static MxAcmt00600107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxAcmt00600107 .class);
    }

}

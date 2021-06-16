
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
 * Class for camt.073.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraBalMvmntModReqStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.073.001.01")
public class MxCamt07300101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraBalMvmntModReqStsAdvc", required = true)
    protected IntraBalanceMovementModificationRequestStatusAdviceV01 intraBalMvmntModReqStsAdvc;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 73;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification4Choice.class, AccountSchemeName1Choice.class, AcknowledgedAcceptedStatus21Choice.class, AcknowledgementReason12Choice.class, AcknowledgementReason5Code.class, AcknowledgementReason9 .class, ActiveCurrencyAndAmount.class, AddressType2Code.class, AddressType3Choice.class, Amount2Choice.class, AmountAndDirection5 .class, AmountAndQuantityBreakdown1 .class, BranchAndFinancialInstitutionIdentification6 .class, BranchData3 .class, CashAccount38 .class, CashAccountType2Choice.class, CashBalanceType3Choice.class, CashSubBalanceTypeAndQuantityBreakdown3 .class, ClearingChannel2Code.class, ClearingSystemIdentification2Choice.class, ClearingSystemMemberIdentification2 .class, CopyDuplicate1Code.class, CreditDebitCode.class, DateAndDateTime2Choice.class, DeniedReason11 .class, DeniedReason16Choice.class, DeniedReason4Code.class, DeniedStatus16Choice.class, DocumentIdentification51 .class, DocumentNumber5Choice.class, FinancialIdentificationSchemeName1Choice.class, FinancialInstitutionIdentification18 .class, FinancialInstrumentQuantity1Choice.class, GenericAccountIdentification1 .class, GenericFinancialIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification37 .class, Identification14 .class, IntraBalance5 .class, IntraBalanceMovementModificationRequestStatusAdviceV01 .class, LinkageType1Code.class, LinkageType3Choice.class, Linkages57 .class, MxCamt07300101 .class, NameAndAddress5 .class, NoReasonCode.class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PartyIdentification136 .class, PendingReason16 .class, PendingReason28Choice.class, PendingReason6Code.class, PendingStatus38Choice.class, PostalAddress1 .class, PostalAddress24 .class, PriorityNumeric4Choice.class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, ProcessingStatus71Choice.class, ProprietaryReason4 .class, ProprietaryStatusAndReason6 .class, ProxyAccountIdentification1 .class, ProxyAccountType1Choice.class, References14 .class, References34Choice.class, RejectionAndRepairReason33Choice.class, RejectionAndRepairReason34Choice.class, RejectionOrRepairReason33 .class, RejectionOrRepairReason34 .class, RejectionOrRepairStatus39Choice.class, RejectionOrRepairStatus40Choice.class, RejectionReason34Code.class, RejectionReason35Code.class, RequestDetails22 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, SystemPartyIdentification8 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:camt.073.001.01";

    public MxCamt07300101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt07300101(final String xml) {
        this();
        MxCamt07300101 tmp = parse(xml);
        intraBalMvmntModReqStsAdvc = tmp.getIntraBalMvmntModReqStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt07300101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraBalMvmntModReqStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link IntraBalanceMovementModificationRequestStatusAdviceV01 }
     *     
     */
    public IntraBalanceMovementModificationRequestStatusAdviceV01 getIntraBalMvmntModReqStsAdvc() {
        return intraBalMvmntModReqStsAdvc;
    }

    /**
     * Sets the value of the intraBalMvmntModReqStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraBalanceMovementModificationRequestStatusAdviceV01 }
     *     
     */
    public MxCamt07300101 setIntraBalMvmntModReqStsAdvc(IntraBalanceMovementModificationRequestStatusAdviceV01 value) {
        this.intraBalMvmntModReqStsAdvc = value;
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
    public static MxCamt07300101 parse(String xml) {
        return ((MxCamt07300101) MxReadImpl.parse(MxCamt07300101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt07300101 parse(String xml, MxRead parserImpl) {
        return ((MxCamt07300101) parserImpl.read(MxCamt07300101 .class, xml, _classes));
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
     * Creates an MxCamt07300101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt07300101 message
     * @return
     *     a new instance of MxCamt07300101
     */
    public final static MxCamt07300101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt07300101 .class);
    }

}

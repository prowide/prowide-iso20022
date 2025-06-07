
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
 * Class for seev.042.001.12 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.12")
public class MxSeev04200112
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReportV12 corpActnInstrStmtRpt;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 12;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification66 .class, ActiveCurrencyAnd13DecimalAmount.class, AmountPrice3 .class, AmountPriceType1Code.class, BalanceFormat11Choice.class, CancelledReason8Choice.class, CancelledStatus12Choice.class, CancelledStatusReason11 .class, CancelledStatusReason6Code.class, CorporateActionBalance48 .class, CorporateActionEventAndBalance24 .class, CorporateActionEventDeadlines3 .class, CorporateActionEventType102Choice.class, CorporateActionEventType34Code.class, CorporateActionInstructionStatementReportV12 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionOption11Code.class, CorporateActionOption30Choice.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType2Code.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode21Choice.class, DateCodeAndTimeFormat3 .class, DateFormat43Choice.class, DateFormat44Choice.class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation15 .class, FinancialInstrumentQuantity33Choice.class, Frequency25Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InstructedBalance18 .class, InstructedCorporateActionOption19 .class, InstructionProcessingStatus52Choice.class, MxSeev04200112 .class, NoReasonCode.class, NoSpecifiedReason1 .class, NotificationIdentification5 .class, OptionInstructionDetails9 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification127Choice.class, PendingBalance7 .class, PendingCancellationReason5Choice.class, PendingCancellationReason5Code.class, PendingCancellationStatus7Choice.class, PendingCancellationStatusReason7 .class, PendingReason27Code.class, PendingReason66Choice.class, PendingStatus71Choice.class, PendingStatusReason27 .class, PercentagePrice1 .class, PriceFormat45Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, ProtectTransactionType2Code.class, Quantity48Choice.class, Quantity49Choice.class, Quantity50Choice.class, RejectedReason58Choice.class, RejectedStatus58Choice.class, RejectedStatusReason57 .class, RejectionReason86Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, SettlementTypeAndIdentification25 .class, ShortLong1Code.class, SignedQuantityFormat10 .class, SignedQuantityFormat11 .class, Statement72 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType15Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.12";

    public MxSeev04200112() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200112(final String xml) {
        this();
        MxSeev04200112 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200112(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReportV12 }
     *     
     */
    public CorporateActionInstructionStatementReportV12 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReportV12 }
     *     
     */
    public MxSeev04200112 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReportV12 value) {
        this.corpActnInstrStmtRpt = value;
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
    public static MxSeev04200112 parse(String xml) {
        return ((MxSeev04200112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04200112 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04200112) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200112 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200112 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200112) parserImpl.read(MxSeev04200112 .class, xml, _classes));
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
     * Creates an MxSeev04200112 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200112 message
     * @return
     *     a new instance of MxSeev04200112
     */
    public final static MxSeev04200112 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200112 .class);
    }

}

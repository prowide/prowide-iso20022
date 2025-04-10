
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
 * Class for seev.042.001.09 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.09")
public class MxSeev04200109
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReportV09 corpActnInstrStmtRpt;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 9;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification53 .class, ActiveCurrencyAnd13DecimalAmount.class, AmountPrice3 .class, AmountPriceType1Code.class, BalanceFormat5Choice.class, CancelledReason8Choice.class, CancelledStatus12Choice.class, CancelledStatusReason11 .class, CancelledStatusReason6Code.class, CorporateActionBalance41 .class, CorporateActionEventAndBalance17 .class, CorporateActionEventDeadlines3 .class, CorporateActionEventType29Code.class, CorporateActionEventType85Choice.class, CorporateActionInstructionStatementReportV09 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionOption11Code.class, CorporateActionOption30Choice.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType2Code.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode21Choice.class, DateCodeAndTimeFormat3 .class, DateFormat43Choice.class, DateFormat44Choice.class, DateOrDateTimePeriod1Choice.class, DatePeriod2 .class, DateTimePeriod1 .class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation13 .class, FinancialInstrumentQuantity1Choice.class, Frequency25Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InstructedBalance11 .class, InstructedCorporateActionOption12 .class, InstructionProcessingStatus32Choice.class, MxSeev04200109 .class, NoReasonCode.class, NoSpecifiedReason1 .class, NotificationIdentification5 .class, OptionInstructionDetails3 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification127Choice.class, PendingBalance5 .class, PendingCancellationReason5Choice.class, PendingCancellationReason5Code.class, PendingCancellationStatus7Choice.class, PendingCancellationStatusReason7 .class, PercentagePrice1 .class, PriceFormat45Choice.class, PriceRateType3Code.class, PriceValueType10Code.class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, ProtectTransactionType2Code.class, Quantity17Choice.class, Quantity18Choice.class, Quantity19Choice.class, RejectedReason25Choice.class, RejectedStatus26Choice.class, RejectedStatusReason24 .class, RejectionReason49Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat28Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, SettlementTypeAndIdentification25 .class, ShortLong1Code.class, SignedQuantityFormat6 .class, SignedQuantityFormat7 .class, Statement72 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType15Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.09";

    public MxSeev04200109() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200109(final String xml) {
        this();
        MxSeev04200109 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200109(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReportV09 }
     *     
     */
    public CorporateActionInstructionStatementReportV09 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReportV09 }
     *     
     */
    public MxSeev04200109 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReportV09 value) {
        this.corpActnInstrStmtRpt = value;
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
    public static MxSeev04200109 parse(String xml) {
        return ((MxSeev04200109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04200109 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04200109) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200109 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200109 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200109) parserImpl.read(MxSeev04200109 .class, xml, _classes));
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
     * Creates an MxSeev04200109 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200109 message
     * @return
     *     a new instance of MxSeev04200109
     */
    public static final MxSeev04200109 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200109 .class);
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

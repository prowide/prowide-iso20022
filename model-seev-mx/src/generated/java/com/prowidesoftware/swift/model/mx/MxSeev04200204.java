
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
 * Class for seev.042.002.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:seev.042.002.04")
public class MxSeev04200204
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReport002V04 corpActnInstrStmtRpt;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification29 .class, BalanceFormat2Choice.class, CorporateActionBalanceDetails16 .class, CorporateActionDeadline1Code.class, CorporateActionEventAndBalance8 .class, CorporateActionEventType10Code.class, CorporateActionEventType22Choice.class, CorporateActionInstructionStatementReport002V04 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary2Choice.class, CorporateActionOption17Choice.class, CorporateActionOption7Code.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType1Code.class, DateAndDateTimeChoice.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DeadlineCode2Choice.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation6 .class, FinancialInstrumentQuantity15Choice.class, Frequency6Choice.class, GenericIdentification24 .class, GenericIdentification25 .class, GenericIdentification26 .class, IdentificationSource4Choice.class, InstructedBalanceDetails4 .class, InstructedCorporateActionOption5 .class, MxSeev04200204 .class, NotificationIdentification2 .class, OriginalAndCurrentQuantities3 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification51Choice.class, PendingBalance2 .class, ProprietaryQuantity4 .class, ProprietaryQuantity5 .class, Quantity7Choice.class, Quantity8Choice.class, Quantity9Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat5Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText5 .class, SecurityIdentification15 .class, SettlementTypeAndIdentification5 .class, ShortLong1Code.class, SignedQuantityFormat3 .class, SignedQuantityFormat4 .class, Statement30 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType3Choice.class };
    public static final transient String NAMESPACE = "urn:swift:xsd:seev.042.002.04";

    public MxSeev04200204() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200204(final String xml) {
        this();
        MxSeev04200204 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200204(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReport002V04 }
     *     
     */
    public CorporateActionInstructionStatementReport002V04 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReport002V04 }
     *     
     */
    public MxSeev04200204 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReport002V04 value) {
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
    public static MxSeev04200204 parse(String xml) {
        return ((MxSeev04200204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04200204 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04200204) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200204 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200204 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200204) parserImpl.read(MxSeev04200204 .class, xml, _classes));
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
     * Creates an MxSeev04200204 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200204 message
     * @return
     *     a new instance of MxSeev04200204
     */
    public static final MxSeev04200204 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200204 .class);
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

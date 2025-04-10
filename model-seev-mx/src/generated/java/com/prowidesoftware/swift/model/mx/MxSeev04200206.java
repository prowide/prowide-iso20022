
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
 * Class for seev.042.002.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.002.06")
public class MxSeev04200206
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReport002V06 corpActnInstrStmtRpt;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 42;
    public static final transient int VARIANT = 2;
    public static final transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification41 .class, BalanceFormat7Choice.class, CorporateActionBalanceDetails33 .class, CorporateActionDeadline1Code.class, CorporateActionEventAndBalance12 .class, CorporateActionEventType20Code.class, CorporateActionEventType58Choice.class, CorporateActionInstructionStatementReport002V06 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary4Choice.class, CorporateActionOption23Choice.class, CorporateActionOption7Code.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType1Code.class, DateAndDateTimeChoice.class, DateOrDateTimePeriodChoice.class, DatePeriodDetails.class, DateTimePeriodDetails.class, DeadlineCode4Choice.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation10 .class, FinancialInstrumentQuantity15Choice.class, Frequency26Choice.class, GenericIdentification47 .class, GenericIdentification84 .class, GenericIdentification85 .class, IdentificationSource4Choice.class, InstructedBalanceDetails6 .class, InstructedCorporateActionOption7 .class, MxSeev04200206 .class, NotificationIdentification4 .class, OriginalAndCurrentQuantities7 .class, OtherIdentification2 .class, Pagination.class, PartyIdentification103Choice.class, PendingBalance4 .class, ProprietaryQuantity10 .class, ProprietaryQuantity9 .class, Quantity21Choice.class, Quantity22Choice.class, Quantity23Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat11Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText9 .class, SecurityIdentification20 .class, SettlementTypeAndIdentification21 .class, ShortLong1Code.class, SignedQuantityFormat8 .class, SignedQuantityFormat9 .class, Statement48 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType16Choice.class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.042.002.06";

    public MxSeev04200206() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200206(final String xml) {
        this();
        MxSeev04200206 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200206(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReport002V06 }
     *     
     */
    public CorporateActionInstructionStatementReport002V06 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReport002V06 }
     *     
     */
    public MxSeev04200206 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReport002V06 value) {
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
    public static MxSeev04200206 parse(String xml) {
        return ((MxSeev04200206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04200206 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04200206) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04200206 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200206 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200206) parserImpl.read(MxSeev04200206 .class, xml, _classes));
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
     * Creates an MxSeev04200206 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200206 message
     * @return
     *     a new instance of MxSeev04200206
     */
    public static final MxSeev04200206 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200206 .class);
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

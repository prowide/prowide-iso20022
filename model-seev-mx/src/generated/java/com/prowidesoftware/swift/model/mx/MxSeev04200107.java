
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
 * Class for seev.042.001.07 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnInstrStmtRpt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.07")
public class MxSeev04200107
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnInstrStmtRpt", required = true)
    protected CorporateActionInstructionStatementReportV07 corpActnInstrStmtRpt;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 42;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 7;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification43 .class, BalanceFormat5Choice.class, CorporateActionBalanceDetails37 .class, CorporateActionEventAndBalance13 .class, CorporateActionEventDeadlines1 .class, CorporateActionEventType20Code.class, CorporateActionEventType52Choice.class, CorporateActionInstructionStatementReportV07 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionOption18Choice.class, CorporateActionOption7Code.class, CorporateActionStatementReportingType1Code.class, CorporateActionStatementType1Code.class, DateAndDateTime2Choice.class, DateCode19Choice.class, DateCode21Choice.class, DateCodeAndTimeFormat3 .class, DateFormat43Choice.class, DateFormat44Choice.class, DateOrDateTimePeriod2Choice.class, DatePeriod2 .class, DateTimePeriodDetails2 .class, DateType7Code.class, DateType8Code.class, DefaultProcessingOrStandingInstruction1Choice.class, DeliveryReceiptType2Code.class, EventFrequency4Code.class, EventInformation11 .class, FinancialInstrumentQuantity1Choice.class, Frequency25Choice.class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, InstructedBalanceDetails7 .class, InstructedCorporateActionOption8 .class, MxSeev04200107 .class, NotificationIdentification5 .class, OriginalAndCurrentQuantities6 .class, OtherIdentification1 .class, Pagination1 .class, PartyIdentification92Choice.class, PendingBalance5 .class, ProprietaryQuantity7 .class, ProprietaryQuantity8 .class, Quantity17Choice.class, Quantity18Choice.class, Quantity19Choice.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat8Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, SettlementTypeAndIdentification25 .class, ShortLong1Code.class, SignedQuantityFormat6 .class, SignedQuantityFormat7 .class, Statement65 .class, StatementUpdateType1Code.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, UpdateType15Choice.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.042.001.07";

    public MxSeev04200107() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04200107(final String xml) {
        this();
        MxSeev04200107 tmp = parse(xml);
        corpActnInstrStmtRpt = tmp.getCorpActnInstrStmtRpt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04200107(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnInstrStmtRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInstructionStatementReportV07 }
     *     
     */
    public CorporateActionInstructionStatementReportV07 getCorpActnInstrStmtRpt() {
        return corpActnInstrStmtRpt;
    }

    /**
     * Sets the value of the corpActnInstrStmtRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInstructionStatementReportV07 }
     *     
     */
    public MxSeev04200107 setCorpActnInstrStmtRpt(CorporateActionInstructionStatementReportV07 value) {
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
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxSeev04200107 parse(String xml) {
        return ((MxSeev04200107) MxReadImpl.parse(MxSeev04200107 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04200107 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04200107) parserImpl.read(MxSeev04200107 .class, xml, _classes));
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
     * Creates an MxSeev04200107 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04200107 message
     * @return
     *     a new instance of MxSeev04200107
     */
    public final static MxSeev04200107 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04200107 .class);
    }

}

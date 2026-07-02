
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for semt.028.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "intraPosMvmntQry"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT5semt.028.001.01")
public class MxSemt02800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "IntraPosMvmntQry", required = true)
    protected IntraPositionMovementQueryV01 intraPosMvmntQry;
    public static final transient String BUSINESS_PROCESS = "semt";
    public static final transient int FUNCTIONALITY = 28;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AmountRangeBoundary11 .class, DateAndDateTimeSearch5Choice1 .class, DateAndDateTimeSearch5Choice2 .class, DatePeriod21 .class, DatePeriodSearch1Choice1 .class, DatePeriodSearch1Choice2 .class, DateTimePeriod11 .class, DateTimeSearch2Choice1 .class, FinancialInstrumentQuantitySearch2Choice1 .class, FromToAmountRange11 .class, FromToQuantityRange11 .class, GenericIdentification301 .class, GenericIdentification371 .class, ImpliedCurrencyAmountRange1Choice1 .class, IntraPositionMovementQueryV01 .class, IntraPositionQueryCriteria71 .class, IntraPositionQueryDefinition71 .class, IntraPositionQueryStatus31 .class, IntraPositionStatusType21 .class, IntraPositionType21 .class, Max4AlphaNumericTextFixed.class, Max4AlphaNumericTextFixed1 .class, MovementResponseType1Code.class, MxSemt02800101 .class, PartyIdentification120Choice1 .class, PartyIdentification120Choice2 .class, PartyIdentification1361 .class, PartyIdentification1362 .class, PriorityNumeric4Choice1 .class, ProcessingStatus68Choice1 .class, ProprietaryReason41 .class, QuantityRange1Choice1 .class, QuantityRangeBoundary11 .class, QuantitySearch2Choice1 .class, References36Choice1 .class, SecuritiesAccount191 .class, SecuritiesBalanceType11Code1 .class, SecuritiesBalanceType6Choice1 .class, SecuritiesSettlementStatus1Code.class, SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt028Draft.class, SecurityIdentification191 .class, SettlementStatus26Choice1 .class, SystemPartyIdentification81 .class, TransactionProcessingStatus3Code1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT5semt.028.001.01";

    public MxSemt02800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSemt02800101(final String xml) {
        this();
        MxSemt02800101 tmp = parse(xml);
        intraPosMvmntQry = tmp.getIntraPosMvmntQry();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSemt02800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the intraPosMvmntQry property.
     * 
     * @return
     *     possible object is
     *     {@link IntraPositionMovementQueryV01 }
     *     
     */
    public IntraPositionMovementQueryV01 getIntraPosMvmntQry() {
        return intraPosMvmntQry;
    }

    /**
     * Sets the value of the intraPosMvmntQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntraPositionMovementQueryV01 }
     *     
     */
    public MxSemt02800101 setIntraPosMvmntQry(IntraPositionMovementQueryV01 value) {
        this.intraPosMvmntQry = value;
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
    public static MxSemt02800101 parse(String xml) {
        return ((MxSemt02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSemt02800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSemt02800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSemt02800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSemt02800101 parse(String xml, MxRead parserImpl) {
        return ((MxSemt02800101) parserImpl.read(MxSemt02800101 .class, xml, _classes));
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
     * Creates an MxSemt02800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSemt02800101 message
     * @return
     *     a new instance of MxSemt02800101
     */
    public static final MxSemt02800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSemt02800101 .class);
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

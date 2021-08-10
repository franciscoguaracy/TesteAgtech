package br.com.agtechtafefa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="agendamento")
public class TransferModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "account_origin", nullable = false, length = 10)
	private String accountOrigin; // conta de origem

	@Column(name = "account_destiny", nullable = false, length = 10)
	private String accountDestiny; // conta de destino

	@Column(name = "transf_date", nullable = false, length = 15)
	private LocalDate transfDate; // data da transferencia

	@Column (name = "appointment_date", nullable = false, length = 15)
	private LocalDate appointmentDate; // data do agendamento

	@Column(name = "val_transf", nullable = false, length = 10)
	private BigDecimal valtransf; // valor da transferencia

	@Column
	private Double rateCalculated;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id; // 1
	}

	public String getAccountOrigin() {
		return accountOrigin;
	}

	public void setAccountOrigin(String accountOrigin) {
		this.accountOrigin = accountOrigin; // 2
	}

	public String getAccountDestiny() {
		return accountDestiny;
	}

	public void setAccountDestiny(String accountDestiny) {
		this.accountDestiny = accountDestiny;
	}

	public LocalDate getTransfDate() {
		return transfDate;
	}

	public void setTransfDate(LocalDate transfDate) {
		this.transfDate = transfDate;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public BigDecimal getValtransf() {
		return valtransf;
	}

	public void setValtransf(BigDecimal valtransf) {
		this.valtransf = valtransf;
	}

	public Double getRateCalculated() {
		return rateCalculated;
	}

	public void setRateCalculated(Double rateCalculated) {
		this.rateCalculated = rateCalculated;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TransferModel)) return false;

		TransferModel that = (TransferModel) o;

		if (accountOrigin != null ? !accountOrigin.equals(that.accountOrigin) : that.accountOrigin != null)
			return false;
		if (accountDestiny != null ? !accountDestiny.equals(that.accountDestiny) : that.accountDestiny != null)
			return false;
		if (transfDate != null ? !transfDate.equals(that.transfDate) : that.transfDate != null) return false;
		if (appointmentDate != null ? !appointmentDate.equals(that.appointmentDate) : that.appointmentDate != null)
			return false;
		if (valtransf != null ? !valtransf.equals(that.valtransf) : that.valtransf != null) return false;
		return rateCalculated != null ? rateCalculated.equals(that.rateCalculated) : that.rateCalculated == null;
	}

	@Override
	public int hashCode() {
		int result = accountOrigin != null ? accountOrigin.hashCode() : 0;
		result = 31 * result + (accountDestiny != null ? accountDestiny.hashCode() : 0);
		result = 31 * result + (transfDate != null ? transfDate.hashCode() : 0);
		result = 31 * result + (appointmentDate != null ? appointmentDate.hashCode() : 0);
		result = 31 * result + (valtransf != null ? valtransf.hashCode() : 0);
		result = 31 * result + (rateCalculated != null ? rateCalculated.hashCode() : 0);
		return result;
	}
}